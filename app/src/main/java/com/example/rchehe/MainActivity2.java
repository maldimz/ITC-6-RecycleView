package com.example.rchehe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    ArrayList<TextView> textViews = new ArrayList<>();
    private int[] textViewId = {
            R.id.tv_nama_2,
            R.id.tv_spek,
            R.id.tv_deskripsi
    };

    ImageView ivGambar;
    Button btnTest;
    EditText etNyawa;

    String nama, spek, deskripsi;
    int gambar, nyawa;
    float hasil;
    boolean check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        for (int value : textViewId) textViews.add(findViewById(value));
        ivGambar = findViewById(R.id.iv_gambar);
        etNyawa = findViewById(R.id.et_nyawa);
        btnTest = findViewById(R.id.btn_test);
        btnTest.setOnClickListener(this);
        getData();
        setData();
    }

    private void getData(){
        Log.d("CEK DATA", "Data di dapatkan");
        if(
                getIntent().hasExtra("nama") &&
                getIntent().hasExtra("spek") &&
                getIntent().hasExtra("deskripsi")&&
                getIntent().hasExtra("gambar")
        ){
            nama = getIntent().getStringExtra("nama");
            spek = getIntent().getStringExtra("spek");
            deskripsi = getIntent().getStringExtra("deskripsi");
            gambar = getIntent().getIntExtra("gambar", 1);
        }
    }

    private void setData(){
        Log.d("CEK DATA", "Data di set");
        textViews.get(0).setText(nama);
        textViews.get(1).setText("Spek : " + spek + " Damage Per Second");
        textViews.get(2).setText(deskripsi);
        ivGambar.setImageResource(gambar);
        btnTest.setText("Test " + nama);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_test){
            try {
                check = true;
                if(etNyawa.getText().toString().equals(""))
                    throw new NullPointerException();
                else{
                    nyawa = Integer.parseInt(etNyawa.getText().toString());
                }
            } catch (NumberFormatException nfe) {
                check = false;
                Toast.makeText(this, "Harus Angka!", Toast.LENGTH_SHORT).show();
                Log.d("CEK INPUT", "Nilai harus integer");
            } catch(NullPointerException npe){
                check = false;
                Log.d("CEK INPUT", "Harus Diisi");
                Toast.makeText(this, "Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show();
            }

            if(check){
                hasil = (float) nyawa/Integer.parseInt(spek);
                if(hasil>0){

                    AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this, R.style.Transparent_Dialog);
                    View dialogView = getLayoutInflater().inflate(R.layout.fragment_dialog, null);

                    Log.d("CEK DIALOG", "Dialog Fragment Berjalan");
                    TextView tvHasil = dialogView.findViewById(R.id.tv_hasil);
                    tvHasil.setText("Butuh Waktu " + hasil + " Detik Untuk Membunuh Musuh");
                    Log.d("CEK DIALOG", "Dialog Fragment Data Update");
                    dialogBuilder.setView(dialogView);
                    final AlertDialog dialog = dialogBuilder.create();
                    dialog.show();

                }else{
                    Toast.makeText(this, "Tidak Boleh Mines!", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
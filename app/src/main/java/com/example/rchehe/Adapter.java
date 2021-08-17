package com.example.rchehe;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    ArrayList<User> users;

    public Adapter(Context context, ArrayList<User> users){
        this.context = context;
        this.users = users;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.rowku, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(users.get(position));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
        public void onBind(User user) {
            ArrayList<TextView> textViews = new ArrayList<>(
                    Arrays.asList(
                            itemView.findViewById(R.id.tv_nama)
                    )
            );
            ImageView imageView = itemView.findViewById(R.id.iv_gambar);
            LinearLayout linearLayout = itemView.findViewById(R.id.ll_main);

            ArrayList<String> data = new ArrayList<>(Arrays.asList(
                    user.getNama(),
                    user.getSpek(),
                    user.getDeskripsi()
            ));
                textViews.get(0).setText(data.get(0));
                imageView.setImageResource(user.getGambar());
                linearLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pindah = new Intent(context, MainActivity2.class);
                        pindah.putExtra("nama", data.get(0));
                        pindah.putExtra("spek", data.get(1));
                        pindah.putExtra("deskripsi", data.get(2));
                        pindah.putExtra("gambar", user.getGambar());
                        context.startActivity(pindah);
                        Toast.makeText(v.getContext(), "Anda Memilih " + data.get(0), Toast.LENGTH_SHORT).show();
                        Log.d("CEK DATA", "Data di Kirim");
                    }
                });
        }
    }
}

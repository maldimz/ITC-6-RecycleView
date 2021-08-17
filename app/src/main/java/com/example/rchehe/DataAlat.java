package com.example.rchehe;
import java.util.ArrayList;

public class DataAlat {
    private String nama[] = {
            "Pacul",
            "Arit",
            "Kapak",
            "Pisau",
            "Obeng",
            "Cutter",
            "Pensil",
            "Batu",
            "Sapu Lidi",
            "Panci"
    };

    private String spek[] = {
            "8",
            "9",
            "11",
            "5",
            "3",
            "6",
            "1",
            "2",
            "20",
            "9"
    };

    private String deskripsi[] = {
            "Pacul merupakan Perkakas petani berupa lempeng baja tipis dengan tangkai panjang untuk menggali, mengaduk, dan membalik tanah\n" +
                    "PACUL Alias CANGKUL\n" +
                    "Cangkul masih digunakan hingga kini. Pekerjaan yang lebih berat biasanya menggunakan bajak.\n" +
                    "\n" +
                    "Cangkul biasanya terbuat dari kayu dan besi."
                    + "\n\nsrc Wikipedia",

            "Sabit, arit, atau celurit adalah alat pertanian berupa pisau melengkung menyerupai bulan sabit. " +
                    "Meskipun bentuknya sama, secara bahasa arit dan sabit cenderung merujuk pada alat pertanian, " +
                    "sedangkan celurit pada senjata tajam. Orang yang pekerjaan sehari-harinya menggunakan sabit sebagai " +
                    "alat utama adalah tukang arit.\n\n" +
                    "Celurit menjadi senjata khas suku Madura yang biasa digunakan sebagai senjata carok. " +
                    "Masyarakat Madura biasanya memasukkan khodam, sejenis makhluk gaib yang menempati suatu benda, ke dalam celurit dengan cara merapalkan doa-doa sebelum carok.\n" +
                    "\n" +
                    "Sabit juga digunakan sebagai bagian dari simbol komunisme atau sosialisme revolusioner, yaitu palu arit. Dalam simbol tersebut, sabit melambangkan kelas buruh yang bekerja di sektor pertanian."
                    + "\n\nsrc Wikipedia",

            "Kapak (atau kadang disebut dengan kampak) adalah sebuah alat yang biasanya terbuat dari logam, bermata yang diikat pada sebuah tangkai, biasanya dari kayu. " +
                    "Kapak adalah salah satu alat manusia yang sudah sangat tua usianya, sama umurnya dengan saat manusia pertama kali membuat alat dari batu dan kayu.\n" +
                    "\n" +
                    "Zaman dahulu kapak dibuat dari batu pada zaman batu dan pada zaman besi lalu dibuat dari besi. " +
                    "Kapak sangat berguna dan penggunaannya cukup luas dimulai dari sebagai perkakas pemotong kayu sampai sebagai senjata perang."
                    + "\n\nsrc Wikipedia",

            "Pisau/Knife ialah alat yang digunakan untuk memotong sebuah benda. " +
                    "Pisau terdiri dari dua bagian utama, yaitu bilah pisau dan gagang atau pegangan pisau. " +
                    "Bilah pisau terbuat dari logam pipih yang tepinya dibuat tajam; tepi yang tajam ini disebut mata pisau. " +
                    "Pegangan pisau umumnya berbentuk memanjang agar dapat digenggam dengan tangan.\n" +
                    "\n" +
                    "Bentuk umum pisau mirip dengan pedang, bedanya adalah bahwa bilah pedang lebih panjang daripada bilah pisau.\n" +
                    "\n" +
                    "Bila pisau terlalu kecil untuk memotong sesuatu, gergaji atau kapak mungkin diperlukan."
                    + "\n\nsrc Wikipedia",

            "Obeng adalah sebuah alat yang digunakan untuk mengencangkan atau mengendorkan baut. " +
                    "Anda bisa mendapatkan obeng di toko alat terdekat"
                    + "\n\nsrc Wikipedia",

            "Pisau utilitas adalah semua jenis pisau yang digunakan untuk tujuan pekerjaan manual umum . " +
                    "Pisau tersebut pada awalnya adalah pisau bermata tetap dengan ujung tombak tahan lama yang cocok untuk pekerjaan kasar seperti memotong tali ikat, " +
                    "memotong/menggores kulit , menyembelih hewan, membersihkan sisik ikan, " +
                    "membentuk kembali kayu, dan tugas lainnya. " +
                    "Pisau kerajinan adalah pisau utilitas kecil yang digunakan sebagai alat berorientasi presisi untuk tugas yang lebih halus dan lebih rumit seperti mengukir dan memotong kertas."
                    + "\n\nsrc Wikipedia",

            "Pensil atau potlot adalah alat tulis dan lukis yang awalnya terbuat dari grafit murni. " +
                    "Penulisan dilakukan dengan menggoreskan grafit tersebut ke atas media. " +
                    "Namun grafit murni cenderung mudah patah, terlalu lembut, " +
                    "memberikan efek kotor saat media bergesekan dengan tangan, " +
                    "dan mengotori tangan saat dipegang. " +
                    "Karena itu kemudian diciptakan campuran grafit dengan tanah liat agar komposisinya lebih keras. " +
                    "Selanjutnya komposisi campuran ini dibalut dengan kertas atau kayu."
                    + "\n\nsrc Wikipedia",

            "Batu adalah benda alam yang tersusun atas kumpulan mineral penyusun kerak bumi yang menyatu secara padat maupun yang berserakan. " +
                    "Pembentukan batu merupakan hasil proses alam. " +
                    "Di dalam batu dapat terkandung satu atau beberapa jenis mineral. " +
                    "Batu dapat terbentuk melalui proses kristalisasi magma, sedimentasi, maupun metamorfisme. " +
                    "Dari proses pembentukan tersebut, jenis batu dibedakan menjadi batuan beku, batuan sedimen, dan batuan metamorf."
                    + "\n\nsrc Wikipedia",

            "Sapu lidi (bahasa Inggris: hard broom) adalah alat pembersih halaman, pekarangan, atau jalan raya, " +
                    "sapu lidi banyak di gunakan oleh emak-emak, perumahan, perkantoran atau petugas kebersihan, " +
                    "yang terbuat dari lidi pelepah pohon, lidi yang digunakan bisa berasal dari pelapah kelapa atau aren. " +
                    "Sapu lidi merupakan peralatan rumah tangga khas Indonesia.\n\n" +
                    "Sapu lidi memiliki filosofi bahwa tidak akan terjadi suatu perubahan besar jika hanya dilakukan oleh seseorang, " +
                    "walaupun orang tersebut sangat hebat. Manusia sebagai makhluk sosial diharuskan bekerja bersama-sama " +
                    "agar dapat mewujudkan keinginan bersama dalam membuat suatu perubahan yang besar."
                    + "\n\nsrc Wikipedia",

            "Panci (bahasa Inggris: saucepan) adalah alat masak yang terbuat dari logam (alumunium, baja, dll) dan " +
                    "berbentuk silinder atau mengecil pada bagian bawahnya. Panci bisa memiliki gagang tunggal atau dua \"telinga\" " +
                    "pada kedua sisinya,gagang atau telinga ini difungsikan sebagai pegangan untuk membawa ataupun mengangkat panci dan " +
                    "biasanya digunakan untuk memasak air, sayur berkuah, dll. " +
                    "Ukuran panci biasanya dinyatakan dengan volumenya (biasanya antara 1-8 liter). " +
                    "Panci ini juga belum dikembalikan oleh mantan menteri."
                    + "\n\nsrc Wikipedia"
    };

    private int gambar[] = {
            R.drawable.pacul,
            R.drawable.arit,
            R.drawable.kapak,
            R.drawable.pisau,
            R.drawable.obeng,
            R.drawable.cutter,
            R.drawable.pensil,
            R.drawable.batu,
            R.drawable.sapu_lidi,
            R.drawable.panci
    };

    public ArrayList<User> getAllDataUser() {
        ArrayList<User> list = new ArrayList<>();
        for (int i = 0; i < nama.length; i++) {
            User add = new User();
            add.setNama(nama[i]);
            add.setSpek(spek[i]);
            add.setDeskripsi(deskripsi[i]);
            add.setGambar(gambar[i]);
            list.add(add);
        }

        return list;
    }
}

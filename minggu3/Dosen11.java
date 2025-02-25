class Dosen11 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    // Konstruktor berparameter
    public Dosen11(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    // Method untuk menampilkan data dosen
    void tampilkanData() {
        
        System.out.println("Kode    : " + kode);
        System.out.println("Nama    : " + nama);
        if(jenisKelamin == true){
            System.out.println("Jenis Kelamin : Pria");
        } else if(jenisKelamin == false){
            System.out.println("Jenis Kelamin : Wanita");
        }
        System.out.println("Usia    : " + usia);
        System.out.println("------------------------------");
    }
    
    // menampilkan semua data dosen
    public static void dataSemuaDosen(Dosen11[] daftarDosen) {
        System.out.println("--- Data Semua Dosen ---");
        for (Dosen11 dosen : daftarDosen) {
            dosen.tampilkanData();
        }
    }

    // jumlah dosen berdasarkan jenis kelamin
    public static void jumlahDosenPerJenisKelamin(Dosen11[] daftarDosen) {
        int pria = 0, wanita = 0;
        for (Dosen11 dosen : daftarDosen) {
            if (dosen.jenisKelamin == true) {
                pria++;
            } else if (dosen.jenisKelamin == false){
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria  : " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }

    // rata usia jenis kelamin
    public static void rataUsiaJenisKelamin(Dosen11[] daftarDosen) {
        int totalPria = 0, totalWanita = 0, pria = 0, wanita = 0;

        for (Dosen11 dosen : daftarDosen) {
            if (dosen.jenisKelamin == true) {
                totalPria += dosen.usia;
                pria++;
            } else if (dosen.jenisKelamin == false) {
                totalWanita += dosen.usia;
                wanita++;
            }
        }

        System.out.println("Rata-rata Usia Dosen Pria  : " + (pria > 0 ? (totalPria / pria) : 0));
        System.out.println("Rata-rata Usia Dosen Wanita: " + (wanita > 0 ? (totalWanita / wanita) : 0));
    }

    // method untuk dosen yang paling tua
    public static void infoDosenPalingTua(Dosen11[] daftarDosen) {
        if (daftarDosen.length == 0) return;

        Dosen11 tertua = daftarDosen[0];
        for (Dosen11 dosen : daftarDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }

        System.out.println("Dosen Paling Tua:");
        tertua.tampilkanData();
    }

    // Method bagian dosen yang paling muda
    public static void infoDosenPalingMuda(Dosen11[] daftarDosen) {
        if (daftarDosen.length == 0) return;

        Dosen11 termuda = daftarDosen[0];
        for (Dosen11 dosen : daftarDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }

        System.out.println("Dosen Paling Muda:");
        termuda.tampilkanData();
    }
}
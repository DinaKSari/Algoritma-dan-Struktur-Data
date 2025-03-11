//dina kumala sari 1A absen 11

public class NilaiMahasiswa11 {
    NilaiMahasiswa11(int jumlah) {
        namaMahasiswa = new String[jumlah];
        nim = new String[jumlah];
        tahunMasuk = new int[jumlah];
        nilaiUTS = new int[jumlah];
        nilaiUAS = new int[jumlah];
    }

    String[] namaMahasiswa;
    String[] nim;
    int[] tahunMasuk;
    int[] nilaiUTS;
    int[] nilaiUAS;

    // tabel
    void tabel(){
        System.out.println("   Nama     |    NIM    | Tahun | UTS | UAS");
        for(int i = 0; i< namaMahasiswa.length; i++){
            System.out.printf(namaMahasiswa[i] + "     | " + nim[i] + "    | "+ tahunMasuk[i] + " | "+ nilaiUTS[i] + " | " + nilaiUAS[i]);
            System.out.println();
        }
    }
    
    // Mencari nilai UTS tertinggi
    int cariMaksDC(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int leftMax = cariMaksDC(arr, l, mid);
        int rightMax = cariMaksDC(arr, mid + 1, r);
        return Math.max(leftMax, rightMax);
    }

    // Mencari nilai UTS terendah
    int cariMinDC(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int leftMin = cariMinDC(arr, l, mid);
        int rightMin = cariMinDC(arr, mid + 1, r);
        return Math.min(leftMin, rightMin);
    }

    // Menghitung rerata nilai UAS
    double hitungRataUAS() {
        double total = 0;
        for (int i = 0; i < nilaiUAS.length; i++) {
            total += nilaiUAS[i];
        }
        return total / nilaiUAS.length;
    }
}

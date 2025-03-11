//dina kumala sari 1A absen 11
public class MainNilaiMahasiswa11 {
    public static void main(String[] args) {
        int jumlahMahasiswa = 7; 
        NilaiMahasiswa11 nm = new NilaiMahasiswa11(jumlahMahasiswa);
        String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina"};
        String[] nim = {"220101001", "220101002", "220101003", "220101004", "220101005", "220101006", "220101007"};
        int[] tahun = {2022, 2022, 2021, 2021, 2023, 2020, 2023};
        int[] dataUTS = {78, 85, 90, 76, 92, 88, 80};
        int[] dataUAS = {82, 85, 87, 79, 95, 83, 84};
        
        nm.namaMahasiswa = nama;
        nm.nim = nim;
        nm.tahunMasuk = tahun;
        nm.nilaiUTS = dataUTS;
        nm.nilaiUAS = dataUAS;

        //tabel
        nm.tabel();
        // Menampilkan hasil
        System.out.println("-----------------------------------------------------");
        System.out.println("Nilai UTS tertinggi menggunakan Divide and Conquer: " + nm.cariMaksDC(nm.nilaiUTS, 0, jumlahMahasiswa - 1));
        System.out.println("Nilai UTS terendah menggunakan Divide and Conquer: " + nm.cariMinDC(nm.nilaiUTS, 0, jumlahMahasiswa - 1));
        System.out.println("Rata-rata nilai UAS menggunakan Brute Force: " + nm.hitungRataUAS());
    }
}

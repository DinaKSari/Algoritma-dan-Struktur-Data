package TugasPertemuan12;

public class Mahasiswa11 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    Mahasiswa11(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    void tampilkanData() {
        System.out.printf("%-10s %-15s %-10s %-5s\n", nim, nama, prodi, kelas);
    }
}

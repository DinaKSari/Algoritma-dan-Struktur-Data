public class MahasiswaAkademik11 {
    String nim;
    String nama;
    String prodi;
    String kelas;


    public MahasiswaAkademik11 (String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.printf("%-10s %-15s %-10s %-5.2f%n", nim, nama, prodi, kelas);
    }
}

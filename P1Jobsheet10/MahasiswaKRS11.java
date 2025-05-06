public class MahasiswaKRS11 {
    String nim;
    String nama;
    String prodi;
    String kelas;


    public MahasiswaKRS11(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.print(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}

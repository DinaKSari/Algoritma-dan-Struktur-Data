package vaksinasi;

public class Penerima11 {
    String nama;
    int nomor;

    public Penerima11(int nomor, String nama) {
        this.nomor = nomor;
        this.nama = nama;
    }

    public void infoPenerima() {
        System.out.printf("%-3d %-20s%n", nomor, nama);
    }
}

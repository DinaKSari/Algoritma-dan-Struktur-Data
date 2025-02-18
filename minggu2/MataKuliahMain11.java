public class MataKuliahMain11 {
    public static void main(String[] args) {
        MataKuliah11 mk1 = new MataKuliah11();
        mk1.kodeMK = "ALJAB_TI";
        mk1.nama = "Aljabar linear";
        mk1.sks = 1;
        mk1.jumlahJam = 5;

        mk1.tampilkanInformasi();
        mk1.tambahJam(2);
        mk1.ubahSks(3);
        mk1.tampilkanInformasi();

        MataKuliah11 mk2 = new MataKuliah11("AG_TI","Agama",2,6);
        mk2.tampilkanInformasi();
        mk2.kurangJam(2);
        mk2.tampilkanInformasi();
    }
}

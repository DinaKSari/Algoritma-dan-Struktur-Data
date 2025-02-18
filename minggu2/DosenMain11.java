public class DosenMain11 {
    public static void main(String[] args) {
        Dosen11 ds1 = new Dosen11();
        ds1.idDosen = "MQ";
        ds1.nama = "Mungki Astiningrum, ST., M.Kom.";
        ds1.tahunBergabung = 2004;
        ds1.statusAktif= true;
        ds1.bidangKeahlian = "Algoritma dan struktur data";

        ds1.tampilkanInformasi();
        ds1.hitungMasaKerja(ds1.tahunBergabung);
        ds1.setStatusAktif(false);
        ds1.tampilkanInformasi();
        ds1.hitungMasaKerja(ds1.tahunBergabung);

        Dosen11 ds2 = new Dosen11("BGS","Bagas Satya Dian Nugraha, ST., MT.",2015, true, "Teknologi Informasi");

        ds2.tampilkanInformasi();
        ds1.hitungMasaKerja(ds2.tahunBergabung);
        ds2.ubahKeahlian("Olahraga");
        ds2.tampilkanInformasi();
        ds1.hitungMasaKerja(ds2.tahunBergabung);

    }
}

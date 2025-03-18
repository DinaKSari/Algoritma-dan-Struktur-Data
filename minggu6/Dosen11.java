public class Dosen11 {
    String kode;
    String nama;
    boolean jKelamin;
    int usia;

    Dosen11(String kd, String name, boolean jk, int age){
        kode = kd;
        nama = name;
        jKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
    }
}

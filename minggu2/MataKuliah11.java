public class MataKuliah11 {
    public MataKuliah11(){

    }
    public MataKuliah11(String kodeMK, String nm, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        nama = nm;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi(){
        System.out.println("===============================");
        System.out.println("Kode Mata Kuliah = " + kodeMK);
        System.out.println("Nama Mata Kuliah = " + nama);
        System.out.println("Jumlah SKS Mata Kuliah = "+ sks);
        System.out.println("Jumlah Jam Mata Kuliah = " + jumlahJam);
        System.out.println("===============================");
    }

    int ubahSks(int sksTerbaru){
        sks = sksTerbaru;
        System.out.println("SKS telah diubah!");
        return sks;
    }
    
    int tambahJam(int tambahJm){
        jumlahJam =+ tambahJm;
        return jumlahJam;
    }
    int kurangJam(int kurangJm){
        jumlahJam = jumlahJam - kurangJm;
        return jumlahJam;
    }
}

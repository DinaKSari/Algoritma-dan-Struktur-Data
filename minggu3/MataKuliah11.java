public class MataKuliah11 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah11 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
        }
    public void cetakInfo(){
        for(int i=0; i < 3; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            System.out.println("Kode : "+ kode);
            System.out.println("Nama : "+ nama);
            System.out.println("Sks : "+ sks);
            System.out.println("Jumlah Jam : "+ jumlahJam);
            System.out.println("---");
            }
    }
}

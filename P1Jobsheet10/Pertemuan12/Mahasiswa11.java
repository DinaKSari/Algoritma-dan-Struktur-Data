public class Mahasiswa11 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa11(){}
    Mahasiswa11(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi(){
        System.out.printf("%-10s %-15s %-10s %-5.2f%n", nim, nama, kelas, ipk);
    }
}

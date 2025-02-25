import java.util.Scanner;
public class MataKuliahDemo11 {
    public static void main(String[] args) {
        Scanner dina11 = new Scanner(System.in);
        MataKuliah11 [] arrayOfMatakuliah = new MataKuliah11 [3];
        String kode, nama, dummy;
        int sks, jumlahJam;
        for(int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-"+(i+1));
            System.out.print("Kode : ");
            kode = dina11.nextLine();
            System.out.print("Nama : ");
            nama = dina11.nextLine();
            System.out.print("Sks : ");
            dummy = dina11.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam: ");
            dummy = dina11.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------");
            arrayOfMatakuliah[i] = new MataKuliah11 (kode, nama, sks, jumlahJam);
        }
        for(int i=0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            System.out.println("Kode : "+ arrayOfMatakuliah[i].kode);
            System.out.println("Nama : "+ arrayOfMatakuliah[i].nama);
            System.out.println("Sks : "+ arrayOfMatakuliah [i].sks);
            System.out.println("Jumlah Jam: "+ arrayOfMatakuliah[i].jumlahJam);
            System.out.println("----------------------------");
        }
    }
}
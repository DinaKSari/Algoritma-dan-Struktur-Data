//Nama Dina Kumala Sari Kelas 1A NIM 244107020072

import java.util.Scanner;
public class Pemilihan{
    public static void main(String[] args) {
        Scanner dina11 = new Scanner(System.in);
        int i=0;
        double  nilaiAkhir = 0;
        String nilaiHuruf= "", keterangan = "";
        double nilai[]= new double[4];
        String []kategori = {"tugas","kuis","uts","uas"};
        for(i=0;i<kategori.length;i++){
            double nilaiBefore = 0;
            System.out.print("Masukan Nilai " + kategori[i] + " = ");
            nilaiBefore= dina11.nextDouble();
            if(nilaiBefore > 100 || nilaiBefore<0){
                System.out.println("nilai tidak valid");
                System.exit(1);
            }
            if(i == 0){
                nilai[i] = (nilaiBefore * 0.20);
            } else if(i == 1) {
                nilai[i] = (nilaiBefore * 0.20);
            } else if(i == 2) {
                nilai[i] = (nilaiBefore * 0.30);
            } else if(i == 3) {
                nilai[i] = (nilaiBefore * 0.40);
            }
            System.out.println();
        }
        System.out.println("Menghitung nilai . . .");
        for(i=0;i<kategori.length;i++){
            nilaiAkhir += nilai[i];
        }
        if(nilaiAkhir > 80 && nilaiAkhir<= 100){
            nilaiHuruf = "A";
            keterangan = "SELAMAT ANDA SELAMAT ANDA LULUS";
        } else if(nilaiAkhir > 73 && nilaiAkhir<= 80){
            nilaiHuruf = "B+";
            keterangan = "SELAMAT ANDA LULUS";
        } else if(nilaiAkhir > 65 && nilaiAkhir<= 73){
            nilaiHuruf = "B";
            keterangan = "SELAMAT ANDA LULUS";
        } else if(nilaiAkhir > 60 && nilaiAkhir<= 65){
            nilaiHuruf = "C+";
            keterangan = "SELAMAT ANDA LULUS";
        } else if(nilaiAkhir > 50 && nilaiAkhir<= 60){
            nilaiHuruf = "C";
            keterangan = "SELAMAT ANDA LULUS";
        } else if(nilaiAkhir > 39 && nilaiAkhir<= 50){
            nilaiHuruf = "D";
            keterangan = "ANDA TIDAK LULUS";
        } else if(nilaiAkhir <= 39){
            nilaiHuruf = "E";
            keterangan = "ANDA TIDAK ANDA LULUS";
        }
        System.out.println("Nilai akhir = " + nilaiAkhir);
        System.out.println("Nilai huruf = " + nilaiHuruf);
        System.out.println("=================================");
        System.out.println(keterangan);
    }
}
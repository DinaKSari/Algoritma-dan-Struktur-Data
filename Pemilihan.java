//Nama Dina Kumala Sari Kelas 1A NIM 244107020072

import java.util.Scanner;
public class Pemilihan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0, nilaiAkhir = 0;
        int nilai[]= new int[4];
        String []kategori = {"tugas","kuis","uts","uas"};
        for(i=0;i<kategori.length;i++){
            int nilaiBefore = 0;
            System.out.println("Masukan Nilai " + kategori[i]);
            nilaiBefore= sc.nextInt();
            if(nilaiBefore > 100 || nilaiBefore<0){
                System.out.println("nilai tidak valid");
                System.exit(1);
            }
            if(i == 0){
                nilai[i] = (nilaiBefore * (20/100));
            } else if(i == 1) {
                nilai[i] = (nilaiBefore * (20/100));
            } else if(i == 1) {
                nilai[i] = (nilaiBefore * (30/100));
            } else if(i == 1) {
                nilai[i] = (nilaiBefore * (40/100));
            }
        }
        System.out.println("Menghitung nilai . . .");
        for(i=0;i<kategori.length;i++){
            nilaiAkhir += nilai[i];
        }
        System.out.println("Nilai akhir = " + nilaiAkhir);
    }
}
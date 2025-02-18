//Nama Dina Kumala Sari Kelas 1A NIM 244107020072

import java.util.Scanner;
public class PlatMobil {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] KOTA = {{'B', 'A', 'N', 'T', 'E', 'N'},{'J', 'A', 'K', 'A', 'R', 'T', 'A'},{'B', 'A', 'N', 'D', 'U', 'N', 'G'},{'C', 'I', 'R', 'E', 'B', 'O', 'N'},{'B', 'O', 'G', 'O', 'R'},{'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},{'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},{'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},{'M', 'A', 'L', 'A', 'N', 'G'},{'T', 'E', 'G', 'A', 'L'}};

        Scanner dina11 = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char input = dina11.next().charAt(0);

        boolean found = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == input) {
                System.out.print("Nama kota: ");
                for (char c : KOTA[i]) {
                    System.out.print(c);
                }
                System.out.println();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Kode plat tidak ditemukan!");
        }
        dina11.nextLine();
        System.out.println("Ingin melihat table?");
        String jawaban = dina11.next();
        if(jawaban.equalsIgnoreCase("y")){
            System.out.println("TABEL KODE PLAT DAN KOTA:");
            for (int i = 0; i < KODE.length; i++) {
                System.out.print(KODE[i] + " | ");
                for (int j = 0; j < KOTA[i].length; j++) {
                    System.out.print(KOTA[i][j] + " | ");
                }
                System.out.println();
            }
        } else{
            System.out.println("Keluar dari program . . .");
        }
    }
}

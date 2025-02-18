//Nama Dina Kumala Sari Kelas 1A NIM 244107020072

import java.util.Scanner;
public class Kubus {
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static int hitungKeliling(int sisi) {
        return 12 * sisi;
    }

    public static void tampilkanMenu() {
        Scanner dina11 = new Scanner(System.in);
        System.out.println("=== KALKULATOR KUBUS ===");
        System.out.println("1. Hitung Volume");
        System.out.println("2. Hitung Luas Permukaan");
        System.out.println("3. Hitung Keliling");
        System.out.print("Pilih menu (1-3): ");
        
        int pilihan = dina11.nextInt();

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = dina11.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Volume Kubus: " + hitungVolume(sisi));
                break;
            case 2:
                System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                break;
            case 3:
                System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        dina11.close();
    }

    public static void main(String[] args) {
        tampilkanMenu();
    }
}

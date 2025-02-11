//Nama Dina Kumala Sari Kelas 1A NIM 244107020072

import java.util.Scanner;
public class Fungsi {
    public static void tampilkanTabel(String cabang[], String bunga[], int stock[][], int harga[]) {
        System.out.println("\n==============================================");
        System.out.printf("%-15s", "Cabang");
        for (String b : bunga) {
            System.out.printf("%-10s", b);
        }
        System.out.println();
        System.out.println("==============================================");
        
        for (int i = 0; i < cabang.length; i++) {
            System.out.printf("%-15s", cabang[i]);
            for (int j = 0; j < bunga.length; j++) {
                System.out.printf("%-10d", stock[i][j]);
            }
            System.out.println();
        }
        System.out.println("==============================================");
    }
    public static void totalStock(String cabang[], String bunga[], int stock[][], int harga[]){
        System.out.println("\nTotal stok setiap jenis bunga di semua cabang:");
        for (int j = 0; j < bunga.length; j++) {
            int totalStock = 0;
            for (int i = 0; i < cabang.length; i++) {
                totalStock += stock[i][j];
            }
            System.out.println(bunga[j] + " : " + totalStock);
        }
    }
    public static void pendapatanSemua(String cabang[], String bunga[], int stock[][], int harga[]){
        System.out.println("\nPendapatan jika semua bunga terjual:");
        for (int i = 0; i < cabang.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < bunga.length; j++) {
                totalPendapatan += stock[i][j] * harga[j];
            }
            System.out.println(cabang[i] + " : Rp " + totalPendapatan);
        }
    }
    public static void menu(String cabang[], String bunga[], int stock[][], int harga[]){
        Scanner dina11 = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan tabel stok bunga");
            System.out.println("2. Tampilkan total stok bunga");
            System.out.println("3. Tampilkan pendapatan jika semua bunga terjual");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = dina11.nextInt();
            
            switch (pilihan) {
                case 1:
                    tampilkanTabel(cabang, bunga, stock, harga);
                    break;
                case 2:
                    totalStock(cabang, bunga, stock, harga);
                    break;
                case 3:
                    pendapatanSemua(cabang, bunga, stock, harga);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    public static void main(String[] args) {
        String cabang[] = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        String bunga[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int stock[][] = {{10, 5, 15, 7},{6, 11, 9, 12},{2, 10, 10, 5},{5, 7, 12, 9}};
        int harga[] = {75000, 50000, 60000, 10000};
        menu(cabang, bunga, stock, harga);
        
    }
}

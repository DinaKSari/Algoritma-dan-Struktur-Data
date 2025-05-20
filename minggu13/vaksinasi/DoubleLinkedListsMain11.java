package vaksinasi;

import java.util.Scanner;

public class DoubleLinkedListsMain11 {
    public static void main(String[] args) {
        Scanner dina11 = new Scanner(System.in);
        DoubleLinkedLists11 queue = new DoubleLinkedLists11(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Vaksin ===");
            System.out.println("1. Tambah Data Penerima");
            System.out.println("2. Hapus Data Penerima (dequeue)");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = dina11.nextInt();
            dina11.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukan nomor penerima: ");
                    int nomor = dina11.nextInt();
                    dina11.nextLine();
                    System.out.print("Nama: ");
                    String nama = dina11.nextLine();
                    queue.enqueue(new Penerima11(nomor, nama));
                    break;
                case 2:
                    Penerima11 dilayani = queue.dequeue();
                    if (dilayani != null) {
                        System.out.print("Melayani penerima: ");
                        dilayani.infoPenerima();
                    }
                    break;
                case 3:
                    queue.tampilSemua();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        dina11.close();
    }
}

package film;

import java.util.Scanner;

public class FilmMain11 {
    
    public static void main(String[] args) {
        Scanner dina11 = new Scanner(System.in);
        DoubleLinkedLists11 queue = new DoubleLinkedLists11(5);
        int pilihan;

        do {
            System.out.println("\n=== DATA FILM LAYAR LEBAR ===");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Index Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari id film");
            System.out.println("9. Urut Data rating film DESC");
            System.out.println("10. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = dina11.nextInt();
            dina11.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukan ID film: ");
                    int id1 = dina11.nextInt(); dina11.nextLine();
                    System.out.println("Masukan Judul: ");
                    String judul1 = dina11.nextLine(); 
                    System.out.println("Masukan rating: ");
                    double rating1 = dina11.nextDouble();
                    queue.addFirst(new Film11(id1, judul1, rating1));
                    break;
                case 2:
                    System.out.println("Masukan ID film: ");
                    int id2 = dina11.nextInt(); dina11.nextLine();
                    System.out.println("Masukan Judul: ");
                    String judul2 = dina11.nextLine();
                    System.out.println("Masukan rating: ");
                    double rating2 = dina11.nextDouble();
                    queue.addLast(new Film11(id2, judul2, rating2));
                    break;
                case 3:
                    System.out.println("Masukan ID film: ");
                    int id3 = dina11.nextInt(); dina11.nextLine();
                    System.out.println("Masukan Judul: ");
                    String judul3 = dina11.nextLine();
                    System.out.println("Masukan rating: ");
                    double rating3 = dina11.nextDouble();
                    System.out.print("Index: ");
                    int idx3 = dina11.nextInt();
                    queue.addAt(new Film11(id3, judul3, rating3), idx3);
                    break;
                case 4:
                    queue.removeFirst();
                    break;
                case 5:
                    queue.removeLast();
                    break;
                case 6:
                    System.out.print("Index yang akan dihapus: ");
                    int idx6 = dina11.nextInt();
                    queue.removeAt(idx6);
                    break;
                case 7:
                    queue.tampilSemua();
                    break;
                case 8:
                    System.out.print("ID film yang dicari: ");
                    int cari = dina11.nextInt();
                    queue.findByNomor(cari);
                    break;
                case 9:
                    queue.sortDesc();
                    break;
                case 10:
                    System.out.println("Terima kasih.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        dina11.close();
    }
}

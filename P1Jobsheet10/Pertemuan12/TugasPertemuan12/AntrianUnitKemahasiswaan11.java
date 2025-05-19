import java.util.Scanner;
public class AntrianUnitKemahasiswaan11 {
    public static void main(String[] args) {
        Scanner dina11 = new Scanner(System.in);
        QueueLinkedList11 queue = new QueueLinkedList11(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Unit Kemahasiswaan ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Mahasiswa Terakhir");
            System.out.println("5. Lihat Semua Antrian");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = dina11.nextInt(); dina11.nextLine();

            switch (pilihan){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 0:
            default:
        }
        } while (pilihan != 0);

        dina11.close();
    }
}

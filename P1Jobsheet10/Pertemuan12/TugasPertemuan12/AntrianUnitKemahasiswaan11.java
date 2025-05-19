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

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = dina11.nextLine();
                    System.out.print("Nama: ");
                    String nama = dina11.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = dina11.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = dina11.nextLine();
                    Mahasiswa11 mhs = new Mahasiswa11(nim, nama, prodi, kelas);
                    queue.enqueue(mhs);
                    break;
                case 2:
                    Mahasiswa11 dilayani = queue.dequeue();
                    if (dilayani != null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    queue.lihatTerdepan();
                    break;
                case 4:
                    queue.lihatBelakang();
                    break;
                case 5:
                    queue.tampilkanAntrian();
                    break;
                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + queue.jumlahAntrian());
                    break;
                case 7:
                    queue.clear();
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

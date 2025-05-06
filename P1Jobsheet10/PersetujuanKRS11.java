import java.util.Scanner;
public class PersetujuanKRS11 {
    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        AntrianKRS11 antrian = new AntrianKRS11(10);
        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Mempersetujui KRS Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Cek Antrian paling belakang");
            System.out.println("7. Cek jumlah mahasiswa yang sudah disetujui");
            System.out.println("8. Cek jumlah mahasiswa yang belum disetujui");
            System.out.println("9. Clear antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc11.nextInt(); 
            sc11.nextLine();
            switch (pilihan) {
                case 1:
                System.out.print("NIM: ");
                String nim = sc11.nextLine();
                System.out.print("Nama: ");
                String nama = sc11.nextLine();
                System.out.print("Prodi: ");
                String prodi = sc11.nextLine();
                System.out.print("Kelas: ");
                String kelas = sc11.nextLine();
                MahasiswaKRS11 mhs = new MahasiswaKRS11 (nim, nama, prodi, kelas);
                antrian.tambahAntrian (mhs);
                break;
                case 2:
                MahasiswaKRS11 dilayani1 = antrian.layaniMahasiswa();
                if (dilayani1 != null) {
                System.out.print("KRS Mahasiswa ");
                dilayani1.tampilkanData();
                System.out.print(" Telah Disetujui! ");
                }
                System.out.println();
                MahasiswaKRS11 dilayani2 = antrian.layaniMahasiswa();
                if (dilayani2 != null) {
                System.out.print("KRS Mahasiswa ");
                dilayani2.tampilkanData();
                System.out.print(" Telah Disetujui! ");
                }
                break;
                case 3:
                antrian.lihatTerdepan();
                break;
                case 4:
                antrian.tampilkanSemua();
                break;
                case 5:
                System.out.println("Jumlah dalam antrian: "+ antrian.getJumlahAntrian());
                break;
                case 6:
                antrian.lihatAkhir();
                break;
                case 7:
                antrian.getYangSudah();
                break;
                case 8:
                antrian.getYangBelum();
                break;
                case 9:
                antrian.clear();
                break;
                case 0:
                System.out.println("Terima kasih.");
                break; 
                default:
                System.out.println("Pilihan tidak valid.");
                } 
            }while (pilihan != 0);
            sc11.close();
        }
    }


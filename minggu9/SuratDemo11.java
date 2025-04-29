import java.util.Scanner;
public class SuratDemo11 {
    public static void main(String[] args) {
        Scanner dina11 = new Scanner(System.in);
        StackSurat11 stack = new StackSurat11(5); 
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = dina11.nextInt();
            dina11.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = dina11.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = dina11.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = dina11.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = dina11.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi izin (hari): ");
                    int durasi = dina11.nextInt();
                    dina11.nextLine(); 
                    Surat11 surat = new Surat11(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;

                case 2:
                    Surat11 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat dari " + diproses.namaMahasiswa + " berhasil diproses.");
                        System.out.println("Jenis Izin: " + (diproses.jenisIzin == 'S' ? "Sakit" : "Keperluan Lain"));
                        System.out.println("Durasi: " + diproses.durasi + " hari");
                    }
                    break;

                case 3:
                    Surat11 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat Terakhir:");
                        System.out.println("Nama: " + lihat.namaMahasiswa);
                        System.out.println("Kelas: " + lihat.kelas);
                        System.out.println("Jenis Izin: " + (lihat.jenisIzin == 'S' ? "Sakit" : "Keperluan Lain"));
                        System.out.println("Durasi: " + lihat.durasi + " hari");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = dina11.nextLine();
                    boolean ditemukan = stack.searchByName(cariNama);
                    if (ditemukan) {
                        System.out.println("Surat dari " + cariNama + " ditemukan di dalam stack.");
                    } else {
                        System.out.println("Surat dari " + cariNama + " tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }
}

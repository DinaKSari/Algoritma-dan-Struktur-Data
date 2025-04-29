import java.util.Scanner;

public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner dina11 = new Scanner(System.in);
        DataDosen11 dataDosen = new DataDosen11();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Tertua ke Termuda)");
            System.out.println("5. Cari Dosen Berdasarkan Nama (Sequential Search)");
            System.out.println("6. Cari Dosen Berdasarkan Usia (Binary Search)");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = dina11.nextInt();
            dina11.nextLine();

            switch (pilihan) {
                case 1:
                    if (dataDosen.idx < dataDosen.dataDosen11.length) {
                        System.out.print("Masukkan Kode Dosen: ");
                        String kode = dina11.nextLine();
                        System.out.print("Masukkan Nama Dosen: ");
                        String nama = dina11.nextLine();
                        System.out.print("Masukkan Jenis Kelamin (L/P): ");
                        char jk = dina11.next().charAt(0);
                        System.out.print("Masukkan Usia: ");
                        int usia = dina11.nextInt();
                        dina11.nextLine(); 

                        boolean jenisKelamin = (jk == 'L' || jk == 'l');
                        Dosen11 dosenBaru = new Dosen11(kode, nama, jenisKelamin, usia);
                        dataDosen.tambah(dosenBaru);
                        System.out.println("Data dosen berhasil ditambahkan!");
                    } else {
                        System.out.println("Kapasitas data dosen sudah penuh!");
                    }
                    break;

                case 2:
                    System.out.println("\nData Dosen:");
                    dataDosen.tampil();
                    break;

                case 3:
                    System.out.println("\nMengurutkan data dosen berdasarkan usia (termuda -> tertua)...");
                    dataDosen.sortingASC();
                    dataDosen.tampil();
                    break;

                case 4:
                    System.out.println("\nPilih metode sorting DSC:");
                    System.out.println("1. Selection Sort");
                    System.out.println("2. Insertion Sort");
                    System.out.print("Pilihan: ");
                    int metodeSort = dina11.nextInt();
                    
                    if (metodeSort == 1) {
                        dataDosen.sortingDSC();
                    } else if (metodeSort == 2) {
                        dataDosen.insertionSort();
                    } else {
                        System.out.println("Pilihan tidak valid!");
                        continue;
                    }
                    dataDosen.tampil();
                    break;
                
                case 5:
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String cariNama = dina11.nextLine();
                    dataDosen.pencarianDataSequential(cariNama);
                    break;

                case 6:
                    System.out.print("Masukkan usia yang dicari: ");
                    int cariUsia = dina11.nextInt();
                    dataDosen.sortingASC(); 
                    dataDosen.pencarianDataBinary(cariUsia, pilihan, pilihan);
                    dataDosen.tampilHasilPencarianUsia(cariUsia);
                    break;

                case 7:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 7);

        dina11.close();
    }
}
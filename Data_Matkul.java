//Nama Dina Kumala Sari Kelas 1A NIM 244107020072

import java.util.Scanner;
public class Data_Matkul {
    public static void main(String[] args) {
        Scanner dina11 = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = dina11.nextInt();
        dina11.nextLine();

        String[] namaMK11 = new String[n];
        int[] sks11 = new int[n];
        int[] semester = new int[n];
        String[] hari = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMK11[i] = dina11.nextLine();
            System.out.print("Jumlah sks: ");
            sks11[i] = dina11.nextInt();
            System.out.print("Semester: ");
            semester[i] = dina11.nextInt();
            dina11.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hari[i] = dina11.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan Seluruh Jadwal Kuliah");
            System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = dina11.nextInt();
            dina11.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMK11, sks11, semester, hari);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah: ");
                    String cariHari = dina11.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMK11, sks11, semester, hari, cariHari);
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int cariSemester = dina11.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMK11, sks11, semester, hari, cariSemester);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String cariMK = dina11.nextLine();
                    cariMataKuliah(namaMK11, sks11, semester, hari, cariMK);
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Coba lagi.");
            }
        } while (pilihan != 5);

        dina11.close();
    }

    public static void tampilkanSeluruhJadwal(String[] namaMK11, int[] sks11, int[] semester, String[] hari) {
        System.out.println("\n=== SELURUH JADWAL KULIAH ===");
        for (int i = 0; i < namaMK11.length; i++) {
            System.out.println(namaMK11[i] + " | sks: " + sks11[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] namaMK11, int[] sks11, int[] semester, String[] hari, String cariHari) {
        System.out.println("\n=== JADWAL KULIAH HARI " + cariHari.toUpperCase() + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < namaMK11.length; i++) {
            if (hari[i].equalsIgnoreCase(cariHari)) {
                System.out.println(namaMK11[i] + " | sks: " + sks11[i] + " | Semester: " + semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah di hari " + cariHari);
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester(String[] namaMK11, int[] sks11, int[] semester, String[] hari, int cariSemester) {
        System.out.println("\n=== JADWAL KULIAH SEMESTER " + cariSemester + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < namaMK11.length; i++) {
            if (semester[i] == cariSemester) {
                System.out.println(namaMK11[i] + " | sks: " + sks11[i] + " | Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah di semester " + cariSemester);
        }
    }

    public static void cariMataKuliah(String[] namaMK11, int[] sks11, int[] semester, String[] hari, String cariMK) {
        System.out.println("\n=== PENCARIAN MATA KULIAH ===");
        boolean ditemukan = false;
        for (int i = 0; i < namaMK11.length; i++) {
            if (namaMK11[i].equalsIgnoreCase(cariMK)) {
                System.out.println("Nama Mata Kuliah: " + namaMK11[i]);
                System.out.println("sks: " + sks11[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Hari Kuliah: " + hari[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah '" + cariMK + "' tidak ditemukan!");
        }
    }
}

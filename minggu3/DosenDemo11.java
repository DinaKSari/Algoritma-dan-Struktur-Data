import java.util.Scanner;
public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner dina11 = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = dina11.nextInt();
        dina11.nextLine();
        
        Dosen11[] daftarDosen = new Dosen11[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = dina11.nextLine();
            System.out.print("Nama: ");
            String nama = dina11.nextLine();
            System.out.print("Jenis Kelamin (Pria = true/Wanita = false): ");
            boolean jenisKelamin = dina11.nextBoolean();
            System.out.print("Usia: ");
            int usia = dina11.nextInt();
            dina11.nextLine();

            daftarDosen[i] = new Dosen11(kode, nama, jenisKelamin, usia);
            System.out.println("------------------------------");
        }
        // Memanggil method dosen11
        Dosen11.dataSemuaDosen(daftarDosen);
        Dosen11.jumlahDosenPerJenisKelamin(daftarDosen);
        Dosen11.rataUsiaJenisKelamin(daftarDosen);
        Dosen11.infoDosenPalingTua(daftarDosen);
        Dosen11.infoDosenPalingMuda(daftarDosen);

        dina11.close();
    }
}
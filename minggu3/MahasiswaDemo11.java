import java.util.Scanner;
public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner dina11 = new Scanner(System.in);
        Mahasiswa11[] arrayOfMahasiswa = new Mahasiswa11[3];
        String dummy;

        for(int i=0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa11();
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            arrayOfMahasiswa[i].nim =dina11.nextLine();
            System.out.print("Nama : ");
            arrayOfMahasiswa[i].nama =dina11.nextLine();
            System.out.print("Kelas: ");
            arrayOfMahasiswa[i].kelas =dina11.nextLine();
            System.out.print("IPK : ");
            dummy = dina11.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("----");
        }

        for(int i=0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("NIM : "+ arrayOfMahasiswa [i].nim);
            System.out.println("Nama : "+ arrayOfMahasiswa[i].nama);
            System.out.println("Kelas "+ arrayOfMahasiswa [i].kelas);
            System.out.println("IPK : "+ arrayOfMahasiswa [i].ipk);
            System.out.println("---");
            }
    }
}

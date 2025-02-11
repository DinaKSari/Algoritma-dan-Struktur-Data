//Nama Dina Kumala Sari Kelas 1A NIM 244107020072
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner dina11 = new Scanner(System.in);
        String title[] = {"Mata Kuliah","Nilai Angka","Nilai Huruf", "Bobot Nilai"};
        String matkul[] = {"Pancasila","Konsep Teknologi Informasi","Critical Thinking dan Problem Solving","Matematika Dasar","Bahasa Inggris","Dasar Pemrograman","Keselamatan dan Kesehatan Kerja"};
        double nilai[] = new double[matkul.length];
        double nilaiSetara[] = new double[matkul.length];
        String nilaiHuruf[] = new String[matkul.length];
        for(int i = 0; i < matkul.length;i++){
            System.out.println("Masukan nilai Angka untuk Matkul " + matkul[i]);
            nilai[i] = dina11.nextDouble();
            if(nilai[i] > 80 && nilai[i]<= 100){
                nilaiSetara[i] = 4;
                nilaiHuruf[i] = "A";
            } else if(nilai[i] > 73 && nilai[i]<= 80){
                nilaiSetara[i] = 3.5;
                nilaiHuruf[i] = "B+";
            } else if(nilai[i] > 65 && nilai[i]<= 73){
                nilaiSetara[i] = 3;
                nilaiHuruf[i] = "B";
            } else if(nilai[i] > 60 && nilai[i]<= 65){
                nilaiSetara[i] = 2.5;
                nilaiHuruf[i] = "C+";
            } else if(nilai[i] > 50 && nilai[i]<= 60){
                nilaiSetara[i] = 2;
                nilaiHuruf[i] = "C";
            } else if(nilai[i] > 39 && nilai[i]<= 50){
                nilaiSetara[i] = 1;
                nilaiHuruf[i] = "D";
            } else if(nilai[i] <= 39){
                nilaiSetara[i] = 0;
                nilaiHuruf[i] = "E";

            }
        }
        System.out.println("=====================================");
        
        int sks[] = new int[matkul.length];
        double totalBobotSKS = 0;
        int totalSKS = 0;

        for (int i = 0; i < matkul.length; i++) {
        System.out.print("Masukkan bobot SKS untuk matkul " + matkul[i] + ": ");
        sks[i] = dina11.nextInt();

        totalBobotSKS += nilaiSetara[i] * sks[i];
        totalSKS += sks[i];
        }

        double ipSemester = totalBobotSKS / totalSKS;
        
        for(int i=0;i<title.length;i++){
            System.out.print(title[i] + " | ");
        }
        System.out.println();
        for(int i= 0;i<matkul.length;i++){
            System.out.print(matkul[i]);
            System.out.print(" | "+ nilai[i] + " | " + nilaiHuruf[i] + " | " + nilaiSetara[i]);
            System.out.println();
        }
        System.out.println("\n===============================================");
        System.out.println("IP Semester: " + String.format("%.2f", ipSemester));
    }
}

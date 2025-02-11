
import java.util.Scanner;

//Nama Dina Kumala Sari Kelas 1A NIM 244107020072

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title[] = {"Mata Kuliah","Nilai Angka","Nilai Huruf", "Bobot Nilai"};
        String matkul[] = {"Pancasila","Konsep Teknologi Informasi","Critical Thinking dan Problem Solving","Matematika Dasar","Bahasa Inggris","Dasar Pemrograman","Keselamatan dan Kesehatan Kerja"};
        double nilai[] = new double[matkul.length];
        double nilaiSetara[] = new double[matkul.length];
        String nilaiHuruf[][] = new String[matkul.length][2];
        for(int i = 0; i < matkul.length;i++){
            System.out.println("Masukan nilai Angka untuk Matkul " + matkul[i]);
            nilai[i] = sc.nextDouble();
            if(nilai[i] > 80 && nilai[i]<= 100){
                nilaiSetara[i] = 4;
            } else if(nilai[i] > 73 && nilai[i]<= 80){
                nilaiSetara[i] = 3.5;
            } else if(nilai[i] > 65 && nilai[i]<= 73){
                nilaiSetara[i] = 3;
            } else if(nilai[i] > 60 && nilai[i]<= 65){
                nilaiSetara[i] = 2.5;
            } else if(nilai[i] > 50 && nilai[i]<= 60){
                nilaiSetara[i] = 2;
            } else if(nilai[i] > 39 && nilai[i]<= 50){
                nilaiSetara[i] = 1;
            } else if(nilai[i] <= 39){
                nilaiSetara[i] = 0;
            }
        }
        System.out.println("=====================================");
        for(int i=0;i<title.length;i++){
            System.out.print(title[i] + " | ");
        }
        System.out.println();
        for(int i= 0;i<matkul.length;i++){
            System.out.print(matkul[i]);
            for(int j=0;j<3;j++){
                System.out.print(" | "+ nilai[i]);
            }
            System.out.println();
        }
        double ipSemester = 
    }
}

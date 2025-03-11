import java.util.Scanner;
public class MainPangkat11 {
    public static void main(String[] args) {
        Scanner dina11 =  new Scanner(System.in);
        System.out.print( "Masukkan jumlah elemen: ");
        int elemen = dina11.nextInt();

        Pangkat11[] png = new Pangkat11[elemen];
        for(int i=0;i<elemen;i++){
        System.out.print("Masukan nilai basis elemen ke-"+(i+1)+": ");
        int basis = dina11.nextInt(); 
        System.out.print("Masukan nilai pangkat elemen ke-"+(i+1)+": "); 
        int pangkat = dina11.nextInt();
        png[i] = new Pangkat11 (basis, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (Pangkat11 p: png) {
        System.out.println(p.nilai+"^"+p.pangkat+" : "+p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println( "HASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat11 p: png) {
        System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}

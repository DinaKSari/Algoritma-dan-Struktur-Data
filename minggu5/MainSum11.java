import java.util.Scanner;
public class MainSum11 {
    public static void main(String[] args) {
        Scanner dina11 = new Scanner(System.in);
        System.out.println("Masukan jumlah elemen ");
        int elemen = dina11.nextInt();
        Sum11 sm = new Sum11(elemen);
        for(int i=0;i<elemen;i++){
            System.out.println("Masukan keuntungan ke-" + (i+1) + ":");
            sm.keuntungan[i] = dina11.nextDouble();
        }
        System.out.println("Total keuntungan menggunakan Bruteforce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: "+sm.totalDC (sm.keuntungan, 0, elemen-1));
    }
}

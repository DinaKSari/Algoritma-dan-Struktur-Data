import java.util.Scanner;
public class MainFaktorial11 {
    public static void main(String[] args) {
        Scanner dina11 = new Scanner(System.in);
        System.out.println("Masukan nilai");
        int nilai = dina11.nextInt();

        Faktorial11 fk = new Faktorial11();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC " + fk.faktorialDC(nilai));
    }
}

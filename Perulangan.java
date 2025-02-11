//Nama Dina Kumala Sari Kelas 1A NIM 244107020072
import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, nim;
        System.out.println("Masukan NIM = ");
        nim = sc.nextInt();
        n = nim % 100;
        if(n<10){
            n+=10;
        }
        System.out.println("===============");
        System.out.println("n : " + n);
        for(int i = 0; i<=n;i++){
            if(i==6 || i == 10){
                System.out.print("");
            } else if(i % 2 == 0){
                System.out.print(i);
            } else if(i % 2 != 0){
                System.out.print("*");
            }
        }
    }
}

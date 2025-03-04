/* NAMA DINA KUMALA SARI 
 * KELAS 1A
 * NIM 244107020072
 */
import java.util.Scanner;
public class CafeDemo11{
    public static void main(String[] args) {
        Scanner dina11 = new Scanner(System.in);
        int pelanggan;
        //memasukan jumlah pelanggan
        System.out.println("Masukan jumlah pelanggan : ");
        pelanggan = dina11.nextInt();
        //membuat array of object
        Cafe11[] arrayOfPelanggan = new Cafe11[pelanggan];
        for(int i= 0; i<pelanggan;i++){
            //membuat objek
            arrayOfPelanggan[i] = new Cafe11();
            System.out.println("Nama Pelanggan ke-" +(i+1)+ " : ");
            arrayOfPelanggan[i].nama = dina11.next();
            dina11.nextLine();
            //menampilkan menu makanan dan minuman
            arrayOfPelanggan[i].menuKonsumsi();
            System.out.println("-- Masukan makanan/minuman yang ingin dibeli --");
            arrayOfPelanggan[i].makanan = dina11.next();
            dina11.nextLine();
            System.out.println("Total harga yang harus dibayar: ");
            arrayOfPelanggan[i].harga = dina11.nextDouble();
            System.out.println("Uang pembayaran: ");
            arrayOfPelanggan[i].uang = dina11.nextDouble();
            System.out.println("----------------");
        }
        //menampilkan data pelanggan yang melakukan pembayaran dan menghitung transaksinya
        for(int i= 0; i<arrayOfPelanggan.length;i++){
            arrayOfPelanggan[i].menampilkanDataPembayaran();
            arrayOfPelanggan[i].menghitungTotal(arrayOfPelanggan[i].harga,arrayOfPelanggan[i].uang);
        }
        System.out.println("");
    }
}
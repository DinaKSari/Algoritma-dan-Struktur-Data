/* NAMA DINA KUMALA SARI 
 * KELAS 1A
 * NIM 244107020072
 */
public class Cafe11{
    public Cafe11(String nama, String makanan, double harga, double uang){
        this.nama = nama;
        this.makanan = makanan;
        this.harga = harga;
        this.uang = uang;
    }
    public Cafe11(){
        
    }
    String nama, makanan;
    double harga;
    double uang;

    public void menuKonsumsi(){
        System.out.println("--- MENU KONSUMSI ---");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Roti");
        System.out.println("3. Teh");
        System.out.println("4. Kopi");
    }

    public double menghitungTotal(double hrg, double uangPelanggan){
        double total = uangPelanggan - hrg;
        if(total>0){
            System.out.println("Total Kembalian " + nama + "          : Rp." + total);
        } else if(total<0){
            System.out.println("Uang Pembayaran " + nama + " Tidak Cukup Untuk Melakukan Pembayaran");
        } else{
            System.out.println("Tidak ada kembalian");
        }
        return total;
    }

    void menampilkanDataPembayaran(){
        System.out.println("--- DATA PELANGGAN ---");
        System.out.println("Nama pelanggan              : " + nama);
        System.out.println("Makanan/minuman yang dibeli : " + makanan);
        System.out.println("Harga total pembayaran      : Rp." + harga);
        System.out.println("Jumlah uang pelanggan       : Rp." + uang);
    }
}
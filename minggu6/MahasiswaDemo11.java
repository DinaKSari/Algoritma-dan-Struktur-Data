import java.util.Scanner;
public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner dina11 = new Scanner(System.in);
        MahasiswaBerprestasi11 list = new MahasiswaBerprestasi11();
        int jumMahasiswa =5;
        Mahasiswa11 m1 = new Mahasiswa11 ( "123", "Zidan","2A", 3.8);
        Mahasiswa11 m2 = new Mahasiswa11 ( "124", "Ayu", "2A", 3.7);
        Mahasiswa11 m3 = new Mahasiswa11 ( "125", "Sofi","2A", 3.5);
        Mahasiswa11 m4 = new Mahasiswa11 ("126", "Sita", "2A", 3.4);
        Mahasiswa11 m5 = new Mahasiswa11 ( "127", "Miki","2A", 3.2);
        list.tambah (m1);
        list.tambah (m2);
        list.tambah (m3);
        list.tambah (m4);
        list.tambah (m5);
        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        //praktikum 2 - 6.3.5
        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        //praktikum 2 - 6.4.1
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();

        //praktikum 2 - 6.4.1 modifikasi
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list.insertionSortDescending();
        list.tampil();

        //praktikum 1 - 7.2.1
        list.tampil();
        System.out.println("");
        System.out.println( "Pencarian data");
        System.out.println("---.. -");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print( "IPK: ");
        double cari = dina11.nextDouble();
        System.out.println("menggunakan sequential searching");
        double posisi=list.sequentialSearching(cari);
        int pss= (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        list.selectionSort();
        //praktikum 2 - 7.3.1
        System.out.println("-----");
        System.out.println( "Pencarian data");
        System.out.println("-------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print( "IPK: ");
        double cari2 = dina11.nextDouble();
        System.out.println("-----");
        System.out.println("menggunakan binary search");
        System.out.println("-------");
        int posisi2 = list.findBinarySearch(cari2, 0, jumMahasiswa-1);
        int pss2= (int)posisi2;
        list.tampilPosisi (cari2, posisi2);
        list.tampilDataSearch (cari2, posisi2);

        list.insertionSortDescending();
        // pertanyaan nomor 4 - 7.3.1
        System.out.println("-----");
        System.out.println( "Pencarian data");
        System.out.println("-------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print( "IPK: ");
        cari2 = dina11.nextDouble();
        System.out.println("-----");
        System.out.println("menggunakan binary search(sort descending)");
        System.out.println("-------");
        posisi2 = list.findBinarySearchDesc(cari2, 0, jumMahasiswa-1);
        pss2= (int)posisi2;
        list.tampilPosisi (cari2, posisi2);
        list.tampilDataSearch (cari2, posisi2);
    }
}

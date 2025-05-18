import java.util.Scanner;
public class SLLMain11 {
    public static void main(String[] args) {
        //nambah scanner untuk input soal no.3
        Scanner dina11 = new Scanner(System.in);
        SingleLinkedList11 sll = new SingleLinkedList11();
        /* ini data yang ada sebelumnya.
        Mahasiswa11 mhs1 = new Mahasiswa11("2001","Dono","1A", 3.5);
        Mahasiswa11 mhs2 = new Mahasiswa11("2002","Sylvia","1A", 3.6);
        Mahasiswa11 mhs3 = new Mahasiswa11("2003","Xavier","1A", 3.5);
        Mahasiswa11 mhs4 = new Mahasiswa11("2004","Caulus","1D", 3.3);
        */

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = dina11.nextInt();
        dina11.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i+1));
            System.out.print("NIM     : ");
            String nim = dina11.nextLine();
            System.out.print("Nama    : ");
            String nama = dina11.nextLine();
            System.out.print("Kelas   : ");
            String kelas = dina11.nextLine();
            System.out.print("IPK     : ");
            double ipk = dina11.nextDouble();
            dina11.nextLine();

            Mahasiswa11 mhs = new Mahasiswa11(nim, nama, kelas, ipk);
            sll.addLast(mhs); 
        }

        System.out.println("\nData seluruh mahasiswa dalam linked list:");
        sll.print();

        //praktikum 2
        System.out.println("data index 1: ");
        sll.getData(1);
        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("bimon"));
        System.out.println();
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
        
        /* ini kode sebelum modif agar bisa input pakai keyboard
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter ( "Caulus", mhs3);
        sll.insertAt( 2, mhs2);
        sll.print();*/
    }    
}

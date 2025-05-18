public class SLLMain11 {
    public static void main(String[] args) {
        SingleLinkedList11 sll = new SingleLinkedList11();
        Mahasiswa11 mhs1 = new Mahasiswa11("2001","Dono","1A", 3.5);
        Mahasiswa11 mhs2 = new Mahasiswa11("2002","Sylvia","1A", 3.6);
        Mahasiswa11 mhs3 = new Mahasiswa11("2003","Xavier","1A", 3.5);
        Mahasiswa11 mhs4 = new Mahasiswa11("2004","Caulus","1D", 3.3);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter ( "Dirga", mhs3);
        sll.insertAt( 2, mhs2);
        sll.print();
    }    
}

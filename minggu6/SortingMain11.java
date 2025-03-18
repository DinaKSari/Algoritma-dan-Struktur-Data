public class SortingMain11 {
    public static void main(String[] args) {
        int a[] = {20,20,2,7,12};
        Sorting11 dataUrut1 = new Sorting11(a, a.length);

        System.out.println("Data awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println( "Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataUrut1.tampil();
    }
}

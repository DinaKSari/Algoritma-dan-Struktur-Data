public class MahasiswaBerprestasi11 {
    Mahasiswa11 [] listMhs= new Mahasiswa11 [5];
    int idx;

    void tambah (Mahasiswa11 m) {
        if (idx<listMhs.length) {
        listMhs[idx]=m;
        idx++;
        }else {
        System.out.println("data sudah penuh");
        }
    }

    void tampil (){
        for (Mahasiswa11 m:listMhs) {
        m.tampilinformasi();
        System.out.println();
        }
    }

    void bubbleSort() {
        for (int i=0; i<listMhs.length-1; i++){
            for (int j=1; j<listMhs.length-i; j++){
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    Mahasiswa11 tmp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i=0; i<listMhs.length-1; i++){
            int idxMin=i;
            for (int j=i+1; j<listMhs.length; j++){
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
            Mahasiswa11 tmp = listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }

    void insertionSort(){
        for (int i=1; i<listMhs.length; i++){
            Mahasiswa11 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk>temp.ipk) { j--; }
            listMhs[j]=listMhs[j-1];
            listMhs[j]=temp;
        }
    }

    void insertionSortDescending() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa11 temp = listMhs[i];
            int j = i - 1;
    
            // Mengubah kondisi menjadi DESCENDING (besar ke kecil)
            while (j >= 0 && listMhs[j].ipk < temp.ipk) {  
                listMhs[j + 1] = listMhs[j];  
                j--;
            }
            listMhs[j + 1] = temp;  
        }
    }
    
    double sequentialSearching(double cari){
        double posisi = -1;
        for (int j=0; j<listMhs.length; j++){
            if (listMhs[j].ipk==cari){
                posisi=j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi (double x, int pos) {
        if (pos!=-1){
            System.out.println("data mahasiswa dengan IPK: " +x+ " ditemukan pada indeks " +pos);
        }
        else {
            System.out.println("data " +x+ " tidak ditemukan");
        }
    }
    
    void tampilDataSearch (double x, int pos) {
        if (pos !=-1){
        System.out.println("nim\t: "+listMhs[pos].nim);
        System.out.println("nama\t: "+listMhs[pos].nama);
        System.out.println("kelas\t: "+listMhs[pos].kelas);
        System.out.println("ipk\t: "+x);
        }
        else {
        System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari2, int left, int right) {
        int mid;
        if (right>=left){
            mid =(left+right)/2;
            if (cari2 ==listMhs[mid].ipk) {
            return (mid);
            }
            else if (listMhs[mid].ipk>cari2) {
            return findBinarySearch(cari2, left, mid-1);
            }
            else{
            return findBinarySearch(cari2, mid+1, right);
            }
        }
        return -1;
    }

    int findBinarySearchDesc(double cari2, int left, int right) {
        int mid;
        if (right>=left){
            mid =(left+right)/2;
            if (cari2 ==listMhs[mid].ipk) {
            return (mid);
            }
            else if (listMhs[mid].ipk<cari2) {
            return findBinarySearchDesc(cari2, left, mid-1);
            }
            else{
            return findBinarySearchDesc(cari2, mid+1, right);
            }
        }
        return -1;
    }
}

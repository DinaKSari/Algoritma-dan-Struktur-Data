public class DataDosen11 {
    Dosen11 dataDosen11[] = new Dosen11[10];
    int idx;

     // Method untuk menambahkan data dosen
     void tambah(Dosen11 dsn) {
        if (idx < dataDosen11.length) {
            dataDosen11[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    // Method untuk menampilkan data dosen
    void tampil() {
        if (idx == 0) {
            System.out.println("Data dosen kosong!");
            return;
        }
        for (int i = 0; i < idx; i++) { 
            if (dataDosen11[i] != null) {
                dataDosen11[i].tampil();
            }
        }
    }
    

    // Sorting usia ascedning menggunakan Bubble Sort
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {  
            for (int j = 0; j < idx - 1 - i; j++) { 
                if (dataDosen11[j].usia > dataDosen11[j + 1].usia) {
                    Dosen11 temp = dataDosen11[j];
                    dataDosen11[j] = dataDosen11[j + 1];
                    dataDosen11[j + 1] = temp;
                }
            }
        }
        System.out.println("Data dosen berhasil diurutkan (termuda -> tertua).");
    }

    // Sorting usia desending menggunakan Selection Sort
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) { 
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen11[j].usia > dataDosen11[maxIndex].usia) {
                    maxIndex = j;
                }
            }
            Dosen11 temp = dataDosen11[maxIndex];
            dataDosen11[maxIndex] = dataDosen11[i];
            dataDosen11[i] = temp;
        }
        System.out.println("Data dosen berhasil diurutkan (tertua -> termuda).");
    }    

    // Sorting usia desending menggunakan Insertion Sort
    void insertionSort() {
        for (int i = 1; i < idx; i++) { 
            Dosen11 temp = dataDosen11[i];
            int j = i;
            while (j > 0 && dataDosen11[j - 1].usia < temp.usia) {
                dataDosen11[j] = dataDosen11[j - 1];
                j--;
            }
            dataDosen11[j] = temp;
        }
        System.out.println("Data dosen berhasil diurutkan (tertua -> termuda).");
    }
}

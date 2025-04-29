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
    
    // Sorting usia ascending menggunakan Bubble Sort
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
        System.out.println("Data dosen berhasil diurutkan (termuda -> tertua).\n");
    }

    // Sorting usia descending menggunakan Selection Sort
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
        System.out.println("Data dosen berhasil diurutkan (tertua -> termuda).\n");
    }

    // Sorting usia descending menggunakan Insertion Sort
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


    // Pencarian Data Sequential berdasarkan Nama
    void pencarianDataSequential(String cari) {
        boolean ditemukan = false;
        System.out.println("Hasil pencarian untuk nama: " + cari);
        for (int j = 0; j < idx; j++) {
            if (dataDosen11[j].nama.equalsIgnoreCase(cari)) {
                dataDosen11[j].tampil();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Nama " + cari + " tidak ditemukan.");
        }
    }

    // Pencarian Data Binary berdasarkan Usia
    int pencarianDataBinary(int cari2, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
    
            // Pastikan tidak mengecek elemen null
            if (mid >= idx || dataDosen11[mid] == null) {
                return -1;
            }
    
            if (cari2 == dataDosen11[mid].usia) {
                return mid;
            } else if (cari2 < dataDosen11[mid].usia) {
                return pencarianDataBinary(cari2, left, mid - 1);
            } else {
                return pencarianDataBinary(cari2, mid + 1, right);
            }
        }
        return -1;
    }
    

    // Menampilkan hasil pencarian usia
    void tampilHasilPencarianUsia(int cariUsia) {
        int posisi = pencarianDataBinary(cariUsia, 0, idx - 1);
        if (posisi != -1) {
            System.out.println("Dosen dengan usia " + cariUsia + " ditemukan pada indeks " + posisi + ":");
            dataDosen11[posisi].tampil();
        } else {
            System.out.println("Dosen dengan usia " + cariUsia + " tidak ditemukan.");
        }
    }
}

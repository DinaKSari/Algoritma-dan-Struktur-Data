public class AntrianKRS11 {
    MahasiswaKRS11[] data;
    int front;
    int rear;
    int size;
    int max = 10;

    int complete;
    int belumKRS = 30;
    
    public AntrianKRS11 (int max) {
        this.max = max;
        this.data = new MahasiswaKRS11[max];
        this.front = 0;
        this.rear= -1;
        this.size= 0;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else { return false;
        }
    }

    public boolean IsFull () {
        if (size == max) {
        return true;
        } else {
        return false;
        }
    }

    public void lihatTerdepan () {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            System.out.println();
            int nextIndex = (front + 1) % max;
            if (nextIndex != (rear + 1) % max && data[nextIndex] != null) {
                System.out.println("Mahasiswa berikutnya:");
                System.out.println("NIM - NAMA - PRODI - KELAS");
                data[nextIndex].tampilkanData();
            } else {
                System.out.println("Hanya satu orang dalam antrian.");
            }
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
        System.out.println("Antrian kosong.");
        return;
        } System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i=0; i < size; i++) {
        int index = (front + i) % max;
        System.out.print((i + 1) + ". ");
        data[index].tampilkanData();
        System.out.println();
        }
        }

    public void clear() {
        if (!IsEmpty()) {
        front = rear -1;
        size = 0;
        System.out.println("Queue behasil dikosongkan");
        } else {
        System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian (MahasiswaKRS11 mhs) {
        if (IsFull()) {
        System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
        return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }
    

    public MahasiswaKRS11 layaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } 
        MahasiswaKRS11 mhs = data[front];
        front = (front + 1) % max;
        size--;
        complete++;
        belumKRS--;
        return mhs;
    }

    public int getJumlahAntrian() {
        return size;
        }
    
    public void getYangSudah() {
        System.out.println("Jumlah mahasiswa yang sudah disetujui = " + complete);
        }
    public void getYangBelum() {
        System.out.println("Jumlah mahasiswa yang belum disetujui = " + belumKRS);
        }
   
    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
}

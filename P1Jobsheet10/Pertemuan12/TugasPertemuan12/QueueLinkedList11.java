public class QueueLinkedList11 {
    Node11 front, rear;
    int size, max;

    QueueLinkedList11(int max) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.max = max;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void enqueue(Mahasiswa11 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambahkan.");
            return;
        }
        Node11 newNode = new Node11(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    Mahasiswa11 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa melayani.");
            return null;
        }
        Mahasiswa11 temp = front.data;
        front = front.next;
        size--;
        if (isEmpty()) rear = null;
        return temp;
    }

    void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            front.data.tampilkanData();
        }
    }

    void lihatBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            rear.data.tampilkanData();
        }
    }

    void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        Node11 temp = front;
        int i = 1;
        while (temp != null) {
            System.out.print(i + ". ");
            temp.data.tampilkanData();
            temp = temp.next;
            i++;
        }
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    int jumlahAntrian() {
        return size;
    }
}

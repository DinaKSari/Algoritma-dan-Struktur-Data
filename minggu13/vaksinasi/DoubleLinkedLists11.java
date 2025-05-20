package vaksinasi;

public class DoubleLinkedLists11 {
    Node11 head, tail;
    int size, max;

    public DoubleLinkedLists11(int max) {
        this.max = max;
        this.size = 0;
        this.head = this.tail = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size >= max;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public void enqueue(Penerima11 p) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambahkan.");
            return;
        }
        Node11 nodeBaru = new Node11(tail, p, null);
        if (isEmpty()) {
            head = tail = nodeBaru;
        } else {
            tail.next = nodeBaru;
            tail = nodeBaru;
        }
        size++;
        System.out.printf("%s berhasil masuk ke antrian.%n", p.nama);
    }

    public Penerima11 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang dihapus.");
            return null;
        }
        Penerima11 keluar = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        System.out.printf("%s telah menerima vaksinasi.%n", keluar.nama);
        return keluar;
    }

    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Penerima Vaksin:");
        Node11 cur = head;
        int idx = 1;
        while (cur != null) {
            System.out.printf("%2d. ", idx++);
            cur.data.infoPenerima();
            cur = cur.next;
        }
        System.out.printf("Sisa antrian: %d orang%n", size);
    }
    
}

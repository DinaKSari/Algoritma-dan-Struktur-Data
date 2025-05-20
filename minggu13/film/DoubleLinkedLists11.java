package film;

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

    public void enqueue(Film11 f) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambahkan.");
            return;
        }
        Node11 nodeBaru = new Node11(tail, f, null);
        if (isEmpty()) {
            head = tail = nodeBaru;
        } else {
            tail.next = nodeBaru;
            tail = nodeBaru;
        }
        size++;
        System.out.printf("%s berhasil masuk ke antrian.%n", f.judul);
    }

    public Film11 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang dihapus.");
            return null;
        }
        Film11 keluar = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        System.out.printf("%s telah dihapus dari daftar film.%n", keluar.judul);
        return keluar;
    }

    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Film:");
        Node11 current = head;
        int idx = 1;
        while (current != null) {
            System.out.printf("%2d. ", idx++);
            current.data.infoFilm();
            current = current.next;
        }
        System.out.printf("Sisa antrian: %d film%n", size);
    }

    public void addFirst(Film11 f) {
    if (isFull()) {
        System.out.println("Antrian penuh.");
        return;
    }
    Node11 newNode = new Node11(null, f, head);
    if (isEmpty()) {
        tail = newNode;
    } else {
        head.prev = newNode;
    }
    head = newNode;
    size++;
}

public void addLast(Film11 f) {
    enqueue(f);
}

public void addAt(Film11 f, int index) {
    if (isFull()) {
        System.out.println("Antrian penuh.");
        return;
    }
    if (index < 0 || index > size) {
        System.out.println("Index tidak valid.");
        return;
    }
    if (index == 0) {
        addFirst(f);
        return;
    } else if (index == size) {
        addLast(f);
        return;
    }

    Node11 current = head;
    for (int i = 0; i < index; i++) {
        current = current.next;
    }

    Node11 newNode = new Node11(current.prev, f, current);
    current.prev.next = newNode;
    current.prev = newNode;
    size++;
}

public void removeFirst() {
    dequeue();
}

public void removeLast() {
    if (isEmpty()) {
        System.out.println("Antrian kosong.");
        return;
    }
    System.out.printf("%s telah dihapus dari daftar film.%n", tail.data.judul);
    if (tail.prev != null) {
        tail = tail.prev;
        tail.next = null;
    } else {
        head = tail = null;
    }
    size--;
}

public void removeAt(int index) {
    if (isEmpty()) {
        System.out.println("Antrian kosong.");
        return;
    }
    if (index < 0 || index >= size) {
        System.out.println("Index tidak valid.");
        return;
    }

    if (index == 0) {
        removeFirst();
        return;
    } else if (index == size - 1) {
        removeLast();
        return;
    }

    Node11 current = head;
    for (int i = 0; i < index; i++) {
        current = current.next;
    }

    System.out.printf("%s telah dihapus dari daftar film.%n", current.data.judul);
    current.prev.next = current.next;
    current.next.prev = current.prev;
    size--;
}

public void findByNomor(int id) {
    Node11 current = head;
    int idx = 0;
    boolean ditemukan = false;
    while (current != null) {
        if (current.data.id == id) {
            System.out.printf("Film yang memiliki id tersebut ditemukan di index %d:\n", idx);
            current.data.infoFilm();
            ditemukan = true;
            break;
        }
        idx++;
        current = current.next;
    }
    if (!ditemukan) {
        System.out.println("Film yang memiliki id tersebut tidak ditemukan.");
    }
}

public void sortDesc() {
    if (isEmpty() || size == 1) return;

    for (Node11 i = head; i != null; i = i.next) {
        for (Node11 j = i.next; j != null; j = j.next) {
            if (i.data.rating < j.data.rating) {
                Film11 temp = i.data;
                i.data = j.data;
                j.data = temp;
            }
        }
    }
    System.out.println("Data berhasil diurutkan (nomor DESC).");
}

}

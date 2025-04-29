public class StackSurat11 {
    Surat11[] stack;
    int top;
    int size;

    public StackSurat11(int size) {
        this.size = size;
        stack = new Surat11[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat11 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
            System.out.println("Surat berhasil ditambahkan!");
        } else {
            System.out.println("Stack penuh! Tidak dapat menerima surat lagi.");
        }
    }

    public Surat11 pop() {
        if (!isEmpty()) {
            Surat11 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat11 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        }
    }

    public boolean searchByName(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}

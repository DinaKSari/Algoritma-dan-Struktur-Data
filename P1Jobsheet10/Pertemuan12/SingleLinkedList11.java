public class SingleLinkedList11 {
    Node11 head;
    Node11 tail;

    boolean isEmpty(){
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
        Node11 tmp = head;
        System.out.print( "Isi Linked List:\t");
        while (tmp != null) {
        tmp.data.tampilInformasi();
        tmp = tmp.next;
        }
        System.out.println("");
        } else {
        System.out.println( "Linked list kosong");
        }
    }

    public void addFirst (Mahasiswa11 input) {
        Node11 ndInput = new Node11 (input, null);
        if (isEmpty()) {
        head = ndInput;
        tail = ndInput;
        } else {
        ndInput.next = head;
        head = ndInput;
        }
    }

    public void addLast(Mahasiswa11 input) {
        Node11 ndInput = new Node11 (input, null);
        if (isEmpty()) {
        head = ndInput;
        tail = ndInput;
        } else {
        tail.next = ndInput;
        tail = ndInput;
        }
    }
}

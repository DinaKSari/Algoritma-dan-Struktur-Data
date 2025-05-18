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
}

package vaksinasi;

public class Node11 {
    Penerima11 data;
    Node11 prev, next;

    public Node11(Node11 prev, Penerima11 data, Node11 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

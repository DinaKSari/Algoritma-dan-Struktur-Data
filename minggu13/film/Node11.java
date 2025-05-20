package film;

public class Node11 {
    Film11 data;
    Node11 prev, next;

    public Node11(Node11 prev, Film11 data, Node11 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

package LinkedList.Singly;

public class Node<T> {
    T data;     //this is what the Node contains.
    Node<T> next;   //this NEXT serves as a pointer to the next element/node, i.e its a type of Node.

    public Node(T data) {
        this.data = data;
        next = null;
    }
}

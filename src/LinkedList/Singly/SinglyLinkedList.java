package LinkedList.Singly;

public class SinglyLinkedList {
    Node <String>head;

    public SinglyLinkedList(Node<String> head) {
        this.head = head;
    }

    /** >>> To Add to the TAIL(last item pointing to null) in a list. you say:
     current lastNode.Add = newNodeToBeAdded
     * >>> To Add to the HEAD(the first node) have a TEMP variable
     */

    public void addToEnd(Node<String> newNode){
        /**>>> This method adds a new node to the end of the list.
         * >>> 1) save the HEAD to a Current variable,
         * >>> 2)
         * */
        Node<String> current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void addToHead(Node<String> newNode){
        //the current serves as the temporary variable that holds the HEAD
        Node<String> current = head;
        head = newNode;
        head.next = current;
    }

    public void addToMiddle(Node<String> newNode, int position){
        int counter = 1;
        Node<String> current = head;

        while(counter!= position - 1 && current.next!= null){
            current = current.next;
            counter++;
        }
        Node<String> temp = current.next;
        current.next = newNode;
        newNode.next= temp;
    }


    public void printList(){
        Node <String>current = head;
        while (current.next != null){
            System.out.print(current.data);
            System.out.print("-->");
            current = current.next;
        }
        System.out.println("null");
    }

}
class MainTest{
    public static void main(String[] args) {
        Node<String> nodeOne = new Node<>("John");
        SinglyLinkedList list = new SinglyLinkedList(nodeOne);
        list.addToEnd(new Node<>("Mojo"));
        list.addToEnd(new Node<>("Gideon"));
        list.addToEnd(new Node<>("Dammy"));
        list.printList();
    }
}

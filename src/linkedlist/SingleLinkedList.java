package linkedlist;

public class SingleLinkedList {
    Node head;
    public SingleLinkedList(){
        this.head = null;
    }

    public void addLast(Node newNode){
        if (head == null){
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
}

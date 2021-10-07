class LinkedList{
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }
}

public void printList(){
    Node n = head;
    while (n != null){
        System.out.print(n.data+" ");
        n = n.next;
    }
}
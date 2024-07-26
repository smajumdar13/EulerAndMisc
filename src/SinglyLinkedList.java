// Amazon coding question
// to find the longest sub-length of a portion of singly linked list where the current node data is greater or equal to next node data.
public class SinglyLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("Empty Linked List.");
            return;
        }
        System.out.println("Nodes: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addNode(1);
        singlyLinkedList.addNode(6);
        singlyLinkedList.addNode(5);
        singlyLinkedList.addNode(4);
        singlyLinkedList.addNode(22);
        singlyLinkedList.addNode(20);
        singlyLinkedList.addNode(25);
        singlyLinkedList.addNode(21);
        singlyLinkedList.addNode(14);
        singlyLinkedList.addNode(13);
        singlyLinkedList.addNode(12);
        singlyLinkedList.addNode(11);
        singlyLinkedList.addNode(21);

        singlyLinkedList.display();
        findLargestDecreasingOrder(singlyLinkedList);
    }

    public static void findLargestDecreasingOrder(SinglyLinkedList list) {
        Node head = list.head;
        if (head == null ) {
            System.out.println(0);
        }
        if (head.next == null) {
            System.out.println(1);;
        }

        int res = 1;
        int count = 1;
        Node temp = head;

        while (temp.next != null) {
            if (temp.data < temp.next.data) {
                count = 1;
                temp = temp.next;
            } else {
                count++;
                temp = temp.next;
            }
            res = Math.max(res, count);
        }
        System.out.println(res);
    }
}

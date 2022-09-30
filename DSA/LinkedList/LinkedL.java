
public class LinkedL {
    private int size;
    Node head;

    LinkedL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    // add -first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addMiddle(String data, int position) {
        if (position == 1) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int cnt = 1;
        while (cnt < position - 1) {
            temp = temp.next;
            cnt++;
        }
        // inserting at last position
        if (temp.next == null) {
            addLast(data);
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

    // delete

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;

        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) { // null.next
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return size;

    }

    public void reverseInterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node revRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = revRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        LinkedL ls = new LinkedL();
        ls.addFirst("a");
        ls.addFirst("is");
        ls.printList();

        ls.addLast("list");
        ls.printList();

        ls.addFirst("this");
        ls.printList();

        ls.deleteFirst();
        ls.printList();

        ls.deleteLast();
        ls.printList();

        System.out.println(ls.getSize());
        ls.addFirst("this");
        ls.printList();

        System.out.println(ls.getSize());

        ls.printList();

        ls.addMiddle("4", 4);
        ls.printList();

        // ls.reverseInterate();
        // ls.printList();

        ls.head = ls.revRecursive(ls.head);
        ls.printList();

    }

}

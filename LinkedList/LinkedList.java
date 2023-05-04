package LinkedList;

public class LinkedList {

    private static int size;
    static Node head;

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;

            size++;
        }
    }

    // addFirst
    public static void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // addLast
    public static void addLast(String data) {
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

    // printList
    public static void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.print("null");
    }

    // removeFirst
    public static void removeFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        size--;

        head = head.next;
    }

    // removeLast
    public static void removeLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondNode = secondNode.next;
        }

        secondNode.next = null;
    }

    static int getSize() {
        return size;
    }

    public static void main(String[] args) {

        addFirst("sah");
        addFirst("kumar");
        addFirst("om");
        addFirst("am");
        addFirst("i");

        addLast("hi");
        addLast("hi");
        addLast("hi");
        addLast("hi");

        printList();
        
        System.out.println();
        removeLast();
        removeLast();
        removeLast();

        removeFirst();
        printList();
        System.out.println();
        System.out.println("Size of list: "+getSize());

    }
}

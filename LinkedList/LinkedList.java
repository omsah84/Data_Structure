package LinkedList;

public class LinkedList {

    private static int size;
    static Node head;

    //creating Node 
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;

            size++;
        }
    }

    // addFirst in Linked List
    public static void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // addLast in linked list
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

    // printList linked list
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

    // removeFirst element 
    public static void removeFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        size--;

        head = head.next;
    }

    // removeLast element
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


    //to geting size of linked list

    static int getSize() {
        return size;
    }


    //dive code
    public static void main(String[] args) {
        //adding element 
        addFirst("sah");
        addFirst("kumar");
        addFirst("om");
        addFirst("am");
        addFirst("i");

        //adding element in last
        addLast("hi");
        addLast("hi");
        addLast("hi");
        addLast("hi");

        //displaying 

        printList();
        System.out.println();

        //removing last element
        removeLast();
        removeLast();
        removeLast();

        //removing fist element
        removeFirst();

        //displaying
        printList();
        System.out.println();

        //to geting size of list
        System.out.println("Size of list: "+getSize());

    }
}

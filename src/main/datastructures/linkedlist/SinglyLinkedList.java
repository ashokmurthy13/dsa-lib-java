package main.datastructures.linkedlist;

public class SinglyLinkedList {

    private int size;
    private Node head = null;
    private Node tail = null;

    // insert at the end of the list
    public void insert(int data) {

        Node node = new Node(data);

        // if list is empty
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }


    public void insertLast(int data) {
        Node node = new Node(data);
        if (tail != null) {
            tail.next = node;
            tail = node;
        } else {
            head = node;
            tail = node;
        }
    }

    // remove last node from the list
    public void delete() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }

        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }

        Node current = head;
        Node prev = null;

        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
        tail = prev;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }

        Node tmp = head;
        if (tmp.next != null) {
            head = tmp.next;
        } else {
            head = null;
        }
    }

    public void deleteLast() {
        delete();
    }

    public void display() {
        Node tmp = head;

        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }

    public int getSize() {
        return this.size;
    }
}

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

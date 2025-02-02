package test.datastructures;

import main.datastructures.linkedlist.SinglyLinkedList;

public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert(1);
        sll.insert(2);
        sll.insert(3);
        System.out.println(sll.getSize());
        sll.display();
        System.out.println();
        sll.insertFirst(4);
        sll.display();
        System.out.println();
        sll.insertLast(5);
        sll.display();
        System.out.println();
        sll.delete();
        sll.display();
        System.out.println();
        sll.delete();
        sll.display();
        System.out.println();
        sll.deleteFirst();
        sll.display();
        System.out.println();
        sll.deleteLast();
        sll.display();
        System.out.println();
        sll.delete();
        sll.display();
        sll.delete();
    }
}

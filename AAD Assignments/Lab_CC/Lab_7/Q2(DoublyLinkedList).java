/*Write a java program to perform the following operations on a DOUBLY Linked List:
 *  A) Creation 
 *  B) Insertion of a new element at any given position 
 *  C) Deletion of a new element at any given position 
 *  D)Searching a given element 
 *  \E)Reversing the list 
 *  Print the list after each operation.*/

package Lab_7;

public class Q2 {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    private Node head = null;

    public void insert(int data, int p) {
        Node node = new Node(data);
        if (p == 1) {
            if (head != null) {
                node.next = head;
                head.prev = node;
            }
            head = node;
            print();
            return;
        }
        Node temp = head;
        for (int i = 1; i < p - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("index out of bounds");
            return;
        }
        node.next = temp.next;
        node.prev = temp;
        if (temp.next != null) {
            temp.next.prev = node;
        }
        temp.next = node;
         print();
    }

    public void delete(int p) {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        if (p < 1) {
            System.out.println("invalid");
            return;
        }
        if (p == 1) {
            if (head.next != null) {
                head.next.prev = null;
            }
            head = head.next;
            print();
            return;
        }
        Node temp = head;
        for (int i = 1; i < p  && temp != null; i++) {
            temp = temp.next;

        }
        if (temp == null) {
            System.out.println("position out of bounds");
            return;
        }
        if (temp.next!=null) {
            temp.next.prev=temp.prev;
        } if(temp.prev!=null){
            temp.prev.next = temp.next;

        }
        print();
    }

    public boolean search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public void reverse() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node curr = head;
        Node temp = null;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if (temp != null)
            head = temp.prev;
        print();

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }


    public static void main(String[] args) {
     Q2 ob=new Q2();
     ob.insert(40,1);
     ob.insert(50,2);
     ob.insert(60,3);
     ob.delete(2);
     ob.insert(70,3);
     ob.insert(80,4);
        System.out.println(ob.search(90));
        System.out.println(ob.search(70));
        ob.reverse();
    }
}
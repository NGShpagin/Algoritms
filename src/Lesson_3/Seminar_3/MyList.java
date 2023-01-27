package Lesson_3.Seminar_3;

public class MyList {
    Node head;

    public void addLast(int value) {
        Node temp = new Node(value);
        Node t = head;
        if (head != null) {
            while (t.next != null) {
                t = t.next;
            }
            t.next = temp;
        } else head = temp;
    }

    public void removeFirst() {
        if (head != null) head = head.next;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        node.next = head;

    }

    public void printList() {
        Node t = this.head;
        while (t != null) {
            System.out.println(t.value);
            t = t.next;
        }
    }
}

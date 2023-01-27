package Lesson_3.Homework_3;

public class ListOneSide {
    Node head;

    public class Node {
        int value;
        Node next;

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }
    }

    public void revert() {
        if (head != null && head.next != null) {
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }
    private void revert(Node currentNode, Node prevNode) {
        if (currentNode.next == null) head = currentNode;
        else revert(currentNode.next, currentNode);
        currentNode.next = prevNode;
    }

    public void add(int value) {
        Node node = new Node();
        node.value = value;
        Node temp = head;
        head = node;
        node.next = temp;
    }

    public void add(int value, Node node) {
        Node next = node.next;
        Node newNode = new Node();
        newNode.value = value;
        node.next = newNode;
        newNode.next = next;
    }

    @Override
    public String toString() {
        return String.format(String.valueOf(head.value));
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}

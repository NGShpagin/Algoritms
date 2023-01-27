package Lesson_3.Lection_3;

public class ListOneSide {
    Node head;

    //region Реализация стека с помощью связного списка

    // Вставка элемента в стек
    public void push(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    // Извлечение первого элемента стека
    public Integer pop() {
        Integer result = null;
        if (head != null) {
            result = head.value;
            head = head.next;
        }
        return result;
    }
    //endregion

    public void revert() {
        if (head != null && head.next != null) {
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }
    public void revert(Node currentNode, Node prevNode) {
        if (currentNode.next == null) head = currentNode;
        else revert(currentNode.next, currentNode);
        currentNode.next = prevNode;
    }

    public class Node {
        int value;
        Node next;
    }
}

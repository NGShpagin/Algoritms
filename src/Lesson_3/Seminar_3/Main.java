package Lesson_3.Seminar_3;

public class Main {
    public static void main(String[] args) {
        MyList ml = new MyList();
        Node t = ml.head;
        ml.addLast(0);
        ml.addLast(1);
        ml.printList();
        System.out.println();

        ml.addLast(2);

        ml.printList();
        System.out.println();

        ml.removeFirst();
        ml.printList();
    }
}





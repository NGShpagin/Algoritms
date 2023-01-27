package Lesson_3.Homework_3;

public class Main {
    public static void main(String[] args) {
        ListOneSide los = new ListOneSide();
        ListTwoSides lts = new ListTwoSides();
        los.add(1);
        los.add(2);
        los.add(3);
        los.add(4);
        los.add(5);
        los.printList();
        los.revert();
        los.printList();

        System.out.println();

        lts.add(7);
        lts.add(8);
        lts.add(9);
        lts.add(10);
        lts.printList();
        lts.revert();
        lts.printList();
    }
}

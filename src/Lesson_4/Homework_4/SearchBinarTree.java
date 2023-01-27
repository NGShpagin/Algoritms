package Lesson_4.Homework_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SearchBinarTree {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            int k = new Random().nextInt(10);
            myList.add(i);
        }
        Node tree = fillSearchBinarTree(myList);
        printTree(tree, "");
    }

    public static class Node {
        int value;
        Node rightChild;
        Node leftChild;
        Node parent;
    }

    public static Node fillSearchBinarTree(List<Integer> myList) {
        int listSize = myList.size();
        if (listSize == 0) return null;
        Node root = new Node();
        root.value = myList.get(0);
        List<Integer> list1 = new ArrayList<>();
        myList.remove(myList.get(0));
        for (int i = 0; i < listSize/2; i++) {
            list1.add(myList.get(i));
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = listSize / 2; i < listSize-1; i++) {
            list2.add(myList.get(i));
        }
        root.leftChild = fillSearchBinarTree(list1);
        root.rightChild = fillSearchBinarTree(list2);
        return root;
    }

    public static void printTree(Node root, String sp) {
        if (root != null) {
            printTree(root.leftChild, sp + "  ");
            System.out.printf("%s%d %n", sp, root.value);
            printTree(root.rightChild, sp + "  ");
        }
    }
}

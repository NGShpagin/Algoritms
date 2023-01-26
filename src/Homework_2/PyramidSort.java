package Homework_2;

public class PyramidSort {

    public static void main(String[] args) {
        int[] array = new int[] {4, 2, 5, 7, 1, 9, 2, 3, 6, 8, 5};
        pyramidSort(array);
        for (int j : array) {
            System.out.print(j + " ");
        }
        printTree(0, array, "");
    }

    public static void pyramidSort(int[] array) {
        int len = array.length;
        boolean check = true;
        for (int i = 0; i < array.length; i++) {
            int i1 = 2 * i + 1;
            int i2 = 2 * i + 2;
            if (i1 < array.length && array[i] < array[i1]) {
                check = false;
                int temp = array[i];
                array[i] = array[i1];
                array[i1] = temp;
            }
            if (i2 < array.length && array[i] < array[i2]) {
                check = false;
                int temp = array[i];
                array[i] = array[i2];
                array[i2] = temp;
            }
        }
        if (!check) pyramidSort(array);
    }

    public static void printTree(int el, int[] array, String sp) {
        if (el < array.length) {
            printTree(2 * el + 1, array, sp + "  ");
            System.out.printf("%s%d %n", sp, array[el]);
            printTree(2 * el + 2, array, sp + "  ");
        }
    }
}

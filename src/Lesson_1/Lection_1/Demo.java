package Lesson_1.Lection_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo {
    public static void main(String[] args) {
//        List<Integer> availableDevider = findAvailableDevider(10);
//        for (Integer integer : availableDevider) {
//            System.out.println(integer);
//        }
//
//        List<Integer> simpleNumbers = findSimpleNumbers(6);
//        for (Integer integer : simpleNumbers) {
//            System.out.println(integer);
//        }

//        System.out.println(findSum(10));
        AtomicInteger counter = new AtomicInteger(0);
        int fib = fib(10, counter);
        System.out.println("Fib number: " + fib);
        System.out.println("Counter: " + counter.get());

        counter = new AtomicInteger(0);
        fib = fib(11, counter);
        System.out.println("Fib number: " + fib);
        System.out.println("Counter: " + counter.get());

        counter = new AtomicInteger(0);
        fib = fib(12, counter);
        System.out.println("Fib number: " + fib);
        System.out.println("Counter: " + counter.get());
    }

    // Поиск возможных делителей
    public static List<Integer> findAvailableDevider(int number) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            counter++;
           if (number % i == 0)
               result.add(i);
        }
        System.out.println("Counter: " + counter);
        return result;
    }

    // Поиск простого числа
    public static List<Integer> findSimpleNumbers(int max) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                counter++;
                if (i % j == 0) simple = false;
            }
            if (simple) result.add(i);
        }
        System.out.println("Counter: " + counter);
        return result;
    }

    //определение шанса выпадения определенной суммы на игральных костях (для трех шестигранных кубиков)
    public static double findSum(int sum) {
        int count = 0;
        int successResult = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 ; j++) {
                for (int k = 1; k <= 6 ; k++) {
                    count++;
                    if (i + j + k == sum) successResult++;
                }
            }
        }
        return ((double) successResult) / ((double) count);
    }

    // Фибоначчи
    public static int fib(int position, AtomicInteger counter) {
        counter.incrementAndGet();
        if (position == 1) return 0;
        if (position == 2) return 1;
        return fib(position - 1, counter) + fib(position - 2, counter);
    }

    public static List<Integer> simpleNumbers(int max) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                counter++;
                if (i % j == 0) simple = false;
            }
            if (simple) result.add(i);
        }
        System.out.println("Counter: " + counter);
        return result;
    }
}




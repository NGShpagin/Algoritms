package Lesson_1.Homework_1;

import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Math.sqrt;

public class fibonachi {
    public static void main(String[] args) {
        System.out.println(bine(10));
        AtomicInteger counter = new AtomicInteger(0);
        System.out.println(fib(10, counter));
    }

    public static int fib(int position, AtomicInteger counter) {
        counter.incrementAndGet();
        if (position == 1) return 0;
        if (position == 2) return 1;
        return fib(position - 1, counter) + fib(position - 2, counter);
    }

    public static double bine(int num) {
        double num1 = Math.pow(((1 + sqrt(5)) / 2), num);
        double num2 = Math.pow(((1 - sqrt(5)) / 2), num);
        return num1 - num2 / sqrt(5);
    }

}

package com.company;

public class Main {
    //task 1
    public static void main(String[] args) {
//        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//        Find the sum of all the multiples of 3 or 5 below 1000.

        int sum = 0;
        for (float i = 1; i < 1000; i++) {
            if((i % 3) == 0.0 || (i % 5) == 0.0) {
                sum += (int) i;
            }
        }
        System.out.print(sum);
    }
}

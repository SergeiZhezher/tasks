package com.company.Task_5;

public class Task_5 {
    public static void main(String[] args) {
//         Task 5 - http://euler.jakumo.org/problems/pg/1.html
//        2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//                What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

        int num = 100;
        stop: while (true) {
            num++;
            if(num % 2 == 0 && num % 3 == 0 && num % 4 == 0 && num % 5 == 0 && num % 6 == 0 && num % 7 == 0 && num % 8 == 0 && num % 9 == 0 && num % 10 == 0 && num % 11 == 0
                    && num % 12 == 0 && num % 13 == 0 && num % 14 == 0 && num % 15 == 0 && num % 16 == 0 && num % 17 == 0 && num % 18 == 0 && num % 19 == 0 && num % 20 == 0) {
                System.out.println(num); break stop;
            }
        }
    }
}

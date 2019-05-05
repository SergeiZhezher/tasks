package com.company.Task_14;

public class Task_14 {
// Task 14.
// Russian source - http://euler.jakumo.org/problems/view/14.html



//    The following iterative sequence is defined for the set of positive integers:
//
//    n → n/2 (n is even)
//    n → 3n + 1 (n is odd)
//
//    Using the rule above and starting with 13, we generate the following sequence:
//
//            13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
//    It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
//
//    Which starting number, under 100000, produces the longest chain?
//
//    NOTE: Once the chain starts the terms are allowed to go above 100000.





    private static int num = 100000 - 1;
    static boolean b = true;


    static int amountElements = 0; // Длина последовательности
    static int number = 0; //


    static  int numberMaxElement = 0; // число с наибольшей длиной последовательности
    static int maxElement = 0; // Наибольшая длина последовательности

    public static void main(String args[]) {
        for (int i = 0; i < 100000 - 1; i++) {
            number = num;
            b = true;
            while (b) {
                if (num != 1) {
                    if (num % 2 == 0) {
                        num = num / 2;
                    } else {

                        num = num * 3 + 1;
                    }
                    amountElements++;
                } else {
                    num = --number;
                    if (maxElement <= amountElements) {
                        maxElement = amountElements + 1;
                        numberMaxElement = num + 1;
                    }
                    amountElements = 0;
                    b = false;
                }
            }
        }
        System.out.println("Число с самой длиной последовательностю Коллатца: " + numberMaxElement + "; Длина последовательности: " + maxElement);
    }
    }



package com.company.Task_16_17;

import java.util.Scanner;
    // Task 17
    // Russian source - http://euler.jakumo.org/problems/view/17.html

//If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
//
// If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
//
// NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.


public class Task_17 {

    private static String[] ONES = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private static String[] TENS = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};


    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) { // сумує довжину назв чисел від 1 до N
            sum += wordLength(i).length();
        }
        System.out.println(sum + " букв");
    }

    private static String wordLength(int n) { // повертає назву вказаного числа на англіськом
            if(0 <= n && n < 20) { return ONES[n]; }

            else if(20 <= n && n < 100) {
                return TENS[n / 10] + (n % 10 != 0 ? ONES[n % 10] : "");
            }
            else if(100 <= n && n < 1000) {
                return ONES[n / 100] + "hundred" + (n % 100 != 0 ? "and" + wordLength(n % 100) : "");
            }
            else if(1000 <= n && n < 1000000) {
                return ONES[n / 1000] + "thousand" + (n % 1000 != 0 ? wordLength(n % 1000) : "");
            }
        throw new IllegalArgumentException();
    }
}

package com.company.Task_16_17;

import java.math.BigInteger;
    // Task 16
    // Russian source - http://euler.jakumo.org/problems/view/16.html

    //    215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
    //            What is the sum of the digits of the number 21000?

public class Task_16 {

    static int sum = 0;

    public static void main(String[] args) {

        String temp = BigInteger.ONE.shiftLeft(1000).toString(); // <-- це з інтернета взяв.
        // А це мій варіант - String temp = new BigInteger("2").pow(1000).toString();

        for (int i = 0; i < temp.length(); i++)
            sum += temp.charAt(i) - '0';
       System.out.println(sum);
    }
    }


package com.company;

public class Main {
 //Task 6 - a source: http://euler.jakumo.org/problems/pg/1.html

 //Task conditions:

    //The sum of the squares of the first ten natural numbers is,
    //12 + 22 + ... + 102 = 385
    //The square of the sum of the first ten natural numbers is,
    //(1 + 2 + ... + 10)2 = 552 = 3025
    //Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
    //Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum

    public static void main(String[] args) {
        int sumSquares = 0, squaresSum = 0;

        for(int i = 0; i <= 100; i++) {
            sumSquares += i * i;
            squaresSum += i;
        }

        System.out.println("difference between the sum of the squares of the first one hundred natural numbers and the square of the sum: \n"
        + ((squaresSum * squaresSum) - sumSquares));

    }
}


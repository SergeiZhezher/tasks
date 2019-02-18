package com.company.Task_4;

public class Task_4 {
    // TASK 4 - http://euler.jakumo.org/problems/pg/1.html
    //    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    //    Find the largest palindrome made from the product of two 3-digit numbers.

    static boolean b = false;
    static int number = 999;
    static int palindromes;
    static int LargestPalindrome = 0;

    public static void main(String[] args) {
        boolean bool = true;
        while (bool) {
            if(number == 100) {bool = false;}
            else func1();
        }
        System.out.println("the biggest palindrome, obtained by multiplying two three-digit numbers " + LargestPalindrome);
    }

    public static void func1() { // перемножуєм всі можливі комбінації трьохзначних чисел, і віддаємо кожне число на перевірку
        for(int i = 100; i <= 999; i++) {
            String product = "" + number * i;
            func2(product);
        }
        number--;
    }

    public static void func2(String n) { //перевіряємо чи є число паліндромом
        String num = "";
        int length = n.length();
        for (int i = length - 1; i >= 0; i--) {
            num += n.charAt(i);
        }
        if (n.equals(num)) { b = true; palindromes = Integer.parseInt(n);
            if(LargestPalindrome <= palindromes) { LargestPalindrome = palindromes; } // тут взнається найбільший паліндром
        }
        else b = false;
    }
}

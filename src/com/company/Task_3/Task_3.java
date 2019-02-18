package com.company.Task_3;

public class Task_3 {
    //  TASK 3 - http://euler.jakumo.org/problems/pg/1.html
    //        The prime factors of 13195 are 5, 7, 13 and 29.
    //        What is the largest prime factor of the number 6848895 ?

    //          в оригіналі задачі вказано число 600851475143 - воно не вміщається в жодну змінну
    public static boolean bool;
    public static int number = 6848895;

    public static void main(String[] args) {
        func1(number);
    }

    public static void func1(int bb) { // узнаєм самий більшим дільник
        int b  = bb;
        stop: for( int i = b - 1 ; i > 0; i--) {
            if(((b % i) == 0)) {number = i; func2(i); break stop;}
        }
    }

    public static void func2(int n) { // перевіряєм чи цей дільник є простим числом, якщо да то говорим відповідь в іншом випадку
        int num = 0;                  // шукаємо другий по розміру дільник і перевіряємо чи він є простим число і т.д... поки не знайдемо найбільший простий дільник
        stop2: for(int i = n - 1; i > 0; i--) {
            if((n % i) == 0) {
                num++;
            }
            if(num > 2){ bool = false; break stop2;}
            else bool = true;
        }
        if (bool == true) {System.out.print("самый большой простой делитеть числа 6848895 это " + number);}
        else func1(number);
    }
}

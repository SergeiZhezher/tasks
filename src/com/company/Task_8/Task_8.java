package com.company.Task_8;

public class Task_8 extends Line {

    //Task 8, Source - http://euler.jakumo.org/problems/pg/1.html
    //conditions - Наибольшее произведение четырех последовательных цифр в нижеприведенном 1000-значном числе равно 9 × 9 × 8 × 9 = 5832.
    //Найдите наибольшее произведение тринадцати последовательных цифр в данном числе.


    static int[] nums = new int[numbers.trim().length()];
    static int n2 = 0;
    static boolean b = true;

    public static void main(String[] args) { //тут всі числа записуються в массив
        for (int i = 0; i <= numbers.trim().length() - 1; i++) {
            nums[i] = Integer.parseInt(String.valueOf(numbers.trim().charAt(i)));
        }
        //
        while (b) {
            if (n2 != 1000) {
                func2();
            }
            else {b = false; System.out.println( "Greatest product: " + greatestProduct);}
        }
    }

    static int product = 1;
    static int n3 = 0;
    static int n1 = 0; // вказує з якого числа начнеться цикл
    static int greatestProduct = 0;

    public static void func2() { // тут перемножується послідовність чисел

        s: for (int i = n2; i < numbers.trim().length(); i++) {
            product *= nums[i];
            n1++;
            if(n1 == 30) {break s;} //тут можна вказати скільки послідовних цифр  треба взяти

        }

        if (greatestProduct <= product) { //тут взнається добуток(произведения) самой найбільшой послідовності
            greatestProduct = product;
        }
        product = 1;
        n1 = 0;
        n2 = ++n3;
    }

}

package com.company.Task_9;

// TASK 9. Source (in Russian) - http://euler.jakumo.org/problems.html

//        A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//        a2 + b2 = c2
//        For example, 32 + 42 = 9 + 16 = 25 = 52.
//
//        There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//        Find the product abc.

public class Task_9 {

    static int a = 3;
    static int b = 4;
    static int c = 0;
    public static void main(String[] args) {
        GenerationNumbers();
    }

    public static void GenerationNumbers() { // тут генеруються трійки й відаються на перевірки. Коли буде згенерованно потрібну трійку  - знаходиться її добуток.
        stop: for (int i = a; i <= 1000; i++) {
            for (int o = b; o <= 1000; o++) {
                c = (int) Math.sqrt(c = i * i + o * o); //тут вищитується C
                if(check1(i, o) == true && check2(i,o,c) == true && check3(i,o,c) == true && check4(i,o,c) == true && (i + o + c) == 1000) {
                                    System.out.println(i * o * c);
                                    break stop;
                }


                }
            }
        }


   public   static boolean check1(int a, int b) { // перша перевірка // A або B в точності повинно ділитись на 3 або 4 (таке правило)
        boolean b1;
        if(a % 3 == 0 || a % 4 == 0 || b % 3 == 0 || b % 4 == 0) {
            b1 = true;
        } else b1 = false;
        return b1;
    }
    public static boolean check2(int a, int b , int c) { // друга перевірка // A або B або C повинно ділитися на 5
        boolean b1;
        if(a % 5 == 0 || b % 5 == 0 || c % 5 == 0) {
            b1 = true;
        } else b1 = false;
        return b1;
    }
    public static boolean check3(int a, int b , int c) { // перевірка №3
        int n = ((c - a) * (c - b) / 2);
        return sqrt(n);
    }

    public static boolean check4(int a, int b , int c) { // перевірка №4
        boolean b1;
        int x = a % 2 == 0 ? a : b;
        int y = a % 2 != 0 ? a : b;
        long n = c - x;
        long n2 = (c - y) / 2;
        if(sqrt(n) == true && sqrt(n2) == true) {b1 = true;} else b1 = false;
        return b1;

    }


    static boolean sqrt(long n) { // перевіряє чи є число квадратним // ця функція потрібна для третьой і четвертой перевірки

        double d = Math.sqrt(n);         //    long tst = (long)(Math.sqrt(n) + 0.5); //цей закомічений код також взнає чи є число квадратним
        String s = Double.toString(d);   //    return (tst * tst == n);
        return (s.endsWith(".0"));
    }
}

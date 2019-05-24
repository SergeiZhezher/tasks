//    // Task 22
//    // Russian source - http://euler.jakumo.org/problems/view/22.html

//        Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
//
//        For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
//
//        What is the total of all the name scores in the file?


package com.company.Task_22;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Task_22 {
    private static String[] names;


    public static void main(String[] args) throws IOException { // передає текст файла методу 'sort'
        Files.lines(Paths.get("C:\\Users\\zhezh\\IdeaProjects\\tasks\\src\\com\\company\\Task_22\\p022_names.txt"), StandardCharsets.UTF_8).forEach(s -> sort(s));
    }

    static void sort(String s) { //тут імена сортуються в алфавітному порядку і щитаються очки імен
        long sum = 0, val = 0;
        s = s.replace('"', ' ').replaceAll("\\s+", "");
        names = s.split(",");
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            for (int k = 0; k < names[i].length(); k++) {
                val += names[i].charAt(k) - 'A' + 1;
                sum += val * i;
            }
        }
    System.out.println(sum);
    }
}
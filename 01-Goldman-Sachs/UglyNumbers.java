/*
Problem Link: https://practice.geeksforgeeks.org/problems/ugly-numbers2254/1/
Title: Ugly Numbers
Difficulty: Hard
Language: Java
*/

import java.util.*;

class UglyNumbers {

    static long nthUglyNumber(int n)
    {

        TreeSet<Long> t = new TreeSet<>();
        t.add(1L);
        int i = 1;
        while (i < n) {
            long temp = t.pollFirst();
            t.add(temp * 2);
            t.add(temp * 3);
            t.add(temp * 5);
            i++;
        }

        return t.pollFirst();
    }

    public static void main(String[] args)
    {
        int n = 150;
        System.out.println(nthUglyNumber(n));
    }
}
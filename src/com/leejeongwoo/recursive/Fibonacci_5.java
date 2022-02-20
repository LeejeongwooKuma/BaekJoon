package com.leejeongwoo.recursive;

import java.util.Scanner;

public class Fibonacci_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(searchFibo(sc.nextInt()));
        sc.close();
    }
    public static int searchFibo(int input) {
        if (input == 1) {
            return 1;
        }
        if (input == 0) {
            return 0;
        }
        return searchFibo(--input) + searchFibo(--input);
    }
}

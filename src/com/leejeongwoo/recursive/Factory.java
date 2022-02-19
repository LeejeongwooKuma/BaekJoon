package com.leejeongwoo.recursive;

import java.util.Scanner;

public class Factory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factory(sc.nextInt()));
    }
    public static int factory(int input) {
        if (input <= 1) {
            return 1;
        }
        return input *  factory(--input);
    }
}



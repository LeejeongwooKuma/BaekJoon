package com.leejeongwoo.ifconditional;

import java.util.Scanner;

public class ThreeDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b) {
            if (a == c) {
                System.out.println(10000 + a * 1000);
            } else {
                System.out.println(1000 + a * 100);
            }
        } else if (b == c) {
            System.out.println(1000 + b * 100);
        } else if (a == c) {
            System.out.println(1000 + a * 100);
        }
        else {
            System.out.println(Math.max(a,Math.max(b,c)) * 100);
        }
    }
}

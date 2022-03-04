package com.leejeongwoo.bruteforce;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cardCount = sc.nextInt();
        int cardSum = sc.nextInt();
        int[] arrCard = new int[cardCount];
        int sum = 0;
        int maxSum = 0;
        //카드 숫자 입력
        for (int i = 0; i < arrCard.length; i++) {
            arrCard[i] = sc.nextInt();
        }
        for (int i = 0; i < arrCard.length; i++) {
            for (int j = i + 1; j < arrCard.length - 1; j++) {
                for (int k = j + 1; k < arrCard.length; k++) {
                    sum = arrCard[i] + arrCard[j] + arrCard[k];
                    if (sum > maxSum && sum <= cardSum) {
                        maxSum = sum;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}

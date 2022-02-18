package Kakao;

import java.util.Scanner;

public class RewardHunter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println(search2017Reward(sc.nextInt()) + search2018Reward(sc.nextInt()));
        }
    }
    public static int search2017Reward(int input) {
        if (input == 0) {
          return 0;
        } else if (input == 1) {
            return 5000000;
        } else if (input <= 3) {
            return 3000000;
        } else if (input <= 6) {
            return 2000000;
        } else if (input <= 10) {
            return 500000;
        } else if (input <= 15) {
            return 300000;
        } else if (input <= 21) {
            return 100000;
        } else {
            return 0;
        }
    }

    public static int search2018Reward(int input) {
        if (input == 0) {
            return 0;
        } else if (input == 1) {
            return 5120000;
        } else if (input <= 3) {
            return 2560000;
        } else if (input <= 7) {
            return 1280000;
        } else if (input <= 15) {
            return 640000;
        } else if (input <= 31) {
            return 320000;
        } else {
            return 0;
        }
    }
}




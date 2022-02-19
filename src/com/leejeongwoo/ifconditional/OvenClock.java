package com.leejeongwoo.ifconditional;

import java.util.Scanner;

public class OvenClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt(); //시간
        int minute = sc.nextInt(); //분
        int time = sc.nextInt(); //조리 시간
        minute += time;
        for (;;) {
            if (minute > 59) {
                hour++;
                if (hour > 23) {
                    hour -= 24;
                }
                minute -= 60;
            }  else {
                break;
            }
        }
        System.out.println(hour + " " + minute);
    }
}

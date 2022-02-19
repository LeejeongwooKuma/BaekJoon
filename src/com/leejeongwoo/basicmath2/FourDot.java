package com.leejeongwoo.basicmath2;

import java.util.*;

public class FourDot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list_x = new ArrayList<>();
        List<Integer> list_y = new ArrayList<>();
        int x, y; //x, y값
        for (int i = 0; i < 3; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (list_x.contains(x)) { //x 값이 기존의 list_x에 존재하는가?
                list_x.remove(list_x.indexOf(x)); //존재하면 해당 값을 삭제해줌.
                x = 0; //삭제 후 0값을 대체제로 넣어줌
            }
            if (list_y.contains(y)) {
                list_y.remove(list_y.indexOf(y));
                y = 0;
            }
            list_x.add(x);
            list_y.add(y);
        }
        //대체제로 넣은 0을 삭제해줌.
        while (list_x.remove(Integer.valueOf(0))); //remove함수는 요소 삭제 후
        // true(삭제 성공), false(삭제 할 게 없음) 리턴. 또한 remove 매개변수로 그냥 int 값을 주면
        //해당 위치 값을 삭제해버림 그러므로 Integer(object) 객체를 넘겨줌.
        while (list_y.remove(Integer.valueOf(0)));
        System.out.println(list_x.get(0) + " " + list_y.get(0));
    }
}

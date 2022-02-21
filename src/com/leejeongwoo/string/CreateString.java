package com.leejeongwoo.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //문자열 길이
        List<Character> S = new ArrayList<Character>(); //문자열 S
        List<String> T = new ArrayList<String>(); //새로운 문자열 T
        for (int i = 0; i < N; i++) {
            S.add(sc.next().charAt(0)); //char형을 입력받기 위해 charAt 메소드 사용.
        }
        for (int i = 0; i < N; i++) {
            if (S.get(0) > S.get(S.size() - 1)) { //가장 앞 문자보다 가장 뒷 문자가 더 작다. ex) b > a
                T.add(S.get(S.size() - 1).toString()); //S는 Char이기에 String으로 바꿔줌.
                S.remove(S.size() - 1);
            } else if (S.get(0) == S.get(S.size() - 1) && S.size() > 1) { // 가장 앞 문자와 뒷 문자가 같다. + S의 size가 1이면.. 즉 문자가 1개 남았다면 앞뒤 사이즈가 똑같기에 패스
                //그 다음 수를 생각해야함. 맨 앞의 다음 문자와 맨 뒤의 전 문자를 비교해줌.
                int size = S.size();
                for (int j = 1; j < S.size(); j++) {
                    if (S.get(0 + j) == S.get(S.size() - 1 - j)) { //또 맨 앞과 맨 뒤가 같으면 그 다음 문자 비교. 다를때까지 비교!
                        if (j == S.size() - 1) { //만약 모두 같은 문자로만 이루어진 입력값일 경우 대비.
                            T.add(S.get(0).toString());
                            S.remove(S.get(0));
                            continue;
                        }
                        continue;
                    } else if (S.get(0 + j) > S.get(S.size() - 1 - j)) {
                        T.add(S.get(S.size() - 1).toString());
                        S.remove(S.size() - 1);
                        break;

                    } else {
                        T.add(S.get(0).toString());
                        S.remove(S.get(0));
                        break;
                    }
                }
            } else {
                T.add(S.get(0).toString());
                S.remove(S.get(0));
            }
        }
        for (int i = 0; i < T.size(); i++) {
            if (i % 80 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(T.get(i));
        }
    }
}
package BasicMath2;

import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(Math.PI * Math.pow(input, 2) + "\n" + 2 * Math.pow(input, 2));
    }
}
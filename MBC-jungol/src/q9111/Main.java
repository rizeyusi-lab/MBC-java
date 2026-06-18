package q9111;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "jungol olympiad";
        String[] arr = str.split("");
        String answer = "";
        for(int i=0;i<5;i++) {
            int idx = sc.nextInt();
            answer += arr[idx];
        }
        System.out.println(answer);
    }
}
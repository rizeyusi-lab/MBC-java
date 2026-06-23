package q9043;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num % 2 == 1) { // 홀수
                sum += num;
                count++;
            }
        }

        System.out.println("홀수의 합 = " + sum);
        System.out.println("홀수의 평균 = " + (sum / count));
    }
}

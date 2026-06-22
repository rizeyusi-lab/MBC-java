package q9074;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1부터 10까지의 숫자의 개수를 저장할 배열 (인덱스 1~10 사용)
        int[] count = new int[11];

        while (true) {
            int num = scanner.nextInt();

            // 1부터 10 사이의 범위를 벗어나면 반복문 탈출
            if (num < 1 || num > 10) {
                break;
            }

            // 해당 숫자의 카운트 증가
            count[num]++;
        }

        // 1부터 10까지 돌면서 1번 이상 입력된 숫자만 출력
        for (int i = 1; i <= 10; i++) {
            if (count[i] > 0) {
                System.out.println(i + " : " + count[i] + "개");
            }
        }

        scanner.close();
    }
}

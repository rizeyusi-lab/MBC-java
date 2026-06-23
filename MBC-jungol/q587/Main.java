package q587;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 자연수 N 입력받기
        int n = scanner.nextInt();

        // 20 이하의 자연수인 경우에만 재귀함수 실행
        if (n >= 1 && n <= 20) {
            printRecursive(n);
        }

        scanner.close();
    }

    // "recursive"를 N번 출력하는 재귀함수
    public static void printRecursive(int n) {
        // 기저 조건 (종료 조건): n이 0이 되면 재귀를 멈춥니다.
        if (n == 0) {
            return;
        }

        // 문자열 출력
        System.out.println("recursive");

        // 횟수를 1 줄여서 자기 자신을 다시 호출
        printRecursive(n - 1);
    }
}
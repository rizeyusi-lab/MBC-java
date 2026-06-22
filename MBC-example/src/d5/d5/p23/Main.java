package d5.p23;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. 문자열 요소를 가지는 고정 크기 리스트 생성
        List<String> list1 = Arrays.asList("서울시", "중부", "기술", "교육원");
        for (String name : list1) {
            System.out.print(name + " ");
        }
        System.out.println();

        // [주의] 아래 코드의 주석을 풀고 실행하면 UnsupportedOperationException 에러가 발생합니다.
        // list1.add(2, "남부"); // Exception 발생!

        // 2. 정수형 요소를 가지는 고정 크기 리스트 생성
        List<Integer> list2 = Arrays.asList(4, 3, 8, 1, 9, 12);
        for (int value : list2) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

package d5.p22;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        // 데이터 추가
        list.add("Java");         // 인덱스 0
        list.add("JDBC");         // 인덱스 1
        list.add("Servlet/JSP");  // 인덱스 2

        // 특정 인덱스에 삽입 (기존 2번이었던 Servlet/JSP는 뒤로 밀려남)
        list.add(2, "Database");  // 인덱스 2에 삽입
        list.add("iBATIS");       // 맨 뒤에 추가 (인덱스 4)

        // 총 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체수 : " + size);
        System.out.println();

        // 2번 인덱스의 객체 얻기
        String skill = list.get(2);
        System.out.println("2: " + skill);
        System.out.println();

        // 전체 출력 1
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + " : " + str);
        }
        System.out.println();

        // 객체 삭제 프로세스
        list.remove(2);          // 2번 인덱스("Database") 삭제 -> 뒤의 객체들이 앞으로 당겨짐
        list.remove("iBATIS");   // "iBATIS" 값을 가진 객체 삭제
        list.remove(2);          // 또 2번 인덱스 삭제

        // 전체 출력 2
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + " : " + str);
        }
        System.out.println();
    }
}
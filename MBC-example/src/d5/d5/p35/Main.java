package d5.p35;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        // 데이터 추가
        set.add("Java");
        set.add("JDBC");
        set.add("Servle/JSP");
        set.add("Java");      // [중복!] 이미 위에서 "Java"를 넣었기 때문에 저장되지 않음
        set.add("iBATIS");

        // 1차 총 객체 수 확인
        int size = set.size();
        System.out.println("총 객체수: " + size);

        // Iterator를 이용한 전체 출력 (1차)
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }
        System.out.println();

        // 데이터 삭제
        set.remove("JDBC");
        set.remove("iBATIS");

        // 2차 총 객체 수 확인
        System.out.println("총 객체수: " + set.size());

        // Iterator를 이용한 전체 출력 (2차)
        iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }
        System.out.println();

        // 전체 비우기 및 비어있는지 확인
        set.clear();
        if (set.isEmpty()) {
            System.out.println("비어 있음");
        }
    }
}
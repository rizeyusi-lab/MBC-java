package d5.p32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();

        long timeStart;
        long timeEnd;

        // 1. ArrayList에 맨 앞에 데이터 10,000개 추가하기
        timeStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        timeEnd = System.nanoTime();
        System.out.println("ArrayList 걸린 시간 : " + (timeEnd - timeStart) + "ns");

        // 2. LinkedList에 맨 앞에 데이터 10,000개 추가하기
        timeStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        timeEnd = System.nanoTime();
        System.out.println("LinkedList 걸린 시간 : " + (timeEnd - timeStart) + "ns");
    }
}
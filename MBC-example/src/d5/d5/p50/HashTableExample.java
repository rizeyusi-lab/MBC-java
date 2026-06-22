package d5.p50;

import java.util.NavigableSet;
import java.util.TreeSet;

public class HashTableExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<Integer>();

        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        // 내림차순으로 정렬된 NavigableSet 추출
        NavigableSet<Integer> descendingSet = scores.descendingSet();
        for (Integer score : descendingSet) {
            System.out.print(score + " ");
        }
        System.out.println();

        // 내림차순 정렬된 것을 다시 내림차순하여 올림차순 정렬 추출
        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
        for (Integer score : ascendingSet) {
            System.out.print(score + " ");
        }
    }
}

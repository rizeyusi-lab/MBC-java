package d5.p51;

import java.util.NavigableSet;
import java.util.TreeSet;

public class HashTableExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("guess");
        treeSet.add("cherry");

        System.out.println("[c-f 사이의 단어 검색]");

        // c부터 f 사이의 단어를 검색 (시작과 끝 범위 포함: true)
        NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
        for (String word : rangeSet) {
            System.out.println(word);
        }
    }
}
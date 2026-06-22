package d5.p16;

public class CompareMethodExample {
    public static void main(String[] args) {
        // 1. Integer, String 타입을 가지는 Pair 객체 비교 (값이 같음)
        Pair<Integer, String> p1 = new Pair<Integer, String>(2, "사과");
        Pair<Integer, String> p2 = new Pair<Integer, String>(2, "사과");
        boolean result1 = BUtil.<Integer, String>compare(p1, p2);

        if (result1) {
            System.out.println("논리적으로 동등한 객체 입니다.");
        } else {
            System.out.println("논리적으로 동등하지 않은 객체 입니다.");
        }

        // 2. String, String 타입을 가지는 Pair 객체 비교 (값이 다름: "user1" vs "user2")
        Pair<String, String> p3 = new Pair<String, String>("user1", "홍길동");
        Pair<String, String> p4 = new Pair<String, String>("user2", "홍길동");
        boolean result2 = BUtil.<String, String>compare(p3, p4);

        if (result2) {
            System.out.println("논리적으로 동등한 객체 입니다.");
        } else {
            System.out.println("논리적으로 동등하지 않은 객체 입니다.");
        }
    }
}

// 데이터를 쌍으로 저장하는 제네릭 Pair 클래스
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}

// 두 Pair 객체를 비교하는 제네릭 메서드를 가진 BUtil 클래스
class BUtil {
    // <K, V>를 메서드 앞에 붙여 제네릭 메서드임을 선언합니다.
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        // key와 value가 모두 일치하는지 비교합니다.
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;
    }
}
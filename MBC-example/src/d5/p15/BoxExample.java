package d5.p15;

public class BoxExample {
    public static void main(String[] args) {
        // 1. String 타입을 사용하는 Box 객체 생성
        Box<String> box1 = new Box<String>();
        box1.set("홍길동");
        String str = box1.get();
        System.out.println(str);

        // 2. Integer 타입을 사용하는 Box 객체 생성
        Box<Integer> box2 = new Box<Integer>();
        box2.set(6);
        int value = box2.get();
        System.out.println(value);
    }
}

// 제네릭 Box 클래스 정의
class Box<T> {
    private T object;

    public void set(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }
}
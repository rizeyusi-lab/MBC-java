package d4.p15;

public class MemberExample {

    public static void main(String[] args) {

        Member original = new Member("blue", "홍길동", new int[] {90, 80}, new Car("그랜저"));

        Member cloned = original.getMember();

        cloned.scores[0] = 100;
        cloned.car.model = "제네시스";


        System.out.println("[복제 객체 데이터]");
        System.out.println("name : " + cloned.name);
        System.out.println("age : " + cloned.age);
        System.out.print("scores : ");

        for(int i = 0; i < cloned.scores.length; i++) {
            System.out.print(cloned.scores[i] + " ");
        }

        System.out.println();
        System.out.println("car : " + cloned.car.model);


        System.out.println();


        System.out.println("[원본 객체 데이터]");
        System.out.println("name : " + original.name);
        System.out.println("age : " + original.age);
        System.out.print("scores : ");

        for(int i = 0; i < original.scores.length; i++) {
            System.out.print(original.scores[i] + " ");
        }

        System.out.println();
        System.out.println("car : " + original.car.model);
    }
}
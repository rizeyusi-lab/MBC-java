package q615;

import java.util.Scanner;

public class Main {

    static class Student {
        String name;
        int kor;
        int eng;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = sc.next();
        s1.kor = sc.nextInt();
        s1.eng = sc.nextInt();

        s2.name = sc.next();
        s2.kor = sc.nextInt();
        s2.eng = sc.nextInt();

        int avgKor = (s1.kor + s2.kor) / 2;
        int avgEng = (s1.eng + s2.eng) / 2;

        System.out.println(s1.name + " " + s1.kor + " " + s1.eng);
        System.out.println(s2.name + " " + s2.kor + " " + s2.eng);
        System.out.println("avg " + avgKor + " " + avgEng);

        sc.close();
    }
}

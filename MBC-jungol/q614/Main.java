package q614;

import java.util.Scanner;

public class Main {

    static class School {
        String name;
        int grade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        School s1 = new School();
        s1.name = "Jejuelementary";
        s1.grade = 6;

        School s2 = new School();
        s2.name = sc.next();
        s2.grade = sc.nextInt();

        System.out.println(s1.grade + " grade in " + s1.name + " School");
        System.out.println(s2.grade + " grade in " + s2.name + " School");

        sc.close();
    }
}
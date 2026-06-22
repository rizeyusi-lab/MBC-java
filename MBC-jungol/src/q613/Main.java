package q613;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String school = sc.next();
        int grade = sc.nextInt();

        System.out.println("Name : " + name);
        System.out.println("School : " + school);
        System.out.println("Grade : " + grade);

        sc.close();
    }
}
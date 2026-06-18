package q2604;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bowls = sc.next();

        int height = 10;

        for (int i = 1; i < bowls.length(); i++) {
            height += (bowls.charAt(i) == bowls.charAt(i - 1)) ? 5 : 10;
        }
        sc.close();

        System.out.println(height);
    }
}

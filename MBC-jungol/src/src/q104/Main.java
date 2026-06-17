package q104;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] words = line.split(" ");

        System.out.println(words[0] + " " + words[words.length - 1]);

        scanner.close();
    }
}
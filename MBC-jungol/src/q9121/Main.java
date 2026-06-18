package q9121;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = {
                "champion", "tel", "pencil", "jungol", "olympiad",
                "class", "information", "lesson", "book", "lion"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("문자를 입력하세요. ");
        char inputChar = sc.next().charAt(0);

        String searchStr = String.valueOf(inputChar);

        boolean found = false;

        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchStr)) {
                System.out.println(words[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("찾는 단어가 없습니다.");
        }

        sc.close();
    }
}
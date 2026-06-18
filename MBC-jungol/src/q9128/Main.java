package q9128;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String intStr1 = sc.next();
        String intStr2 = sc.next();

        String doubleStr1 = sc.next();
        String doubleStr2 = sc.next();

        int num1 = Integer.parseInt(intStr1);
        int num2 = Integer.parseInt(intStr2);
        int intSum = num1 + num2;

        double dNum1 = Double.parseDouble(doubleStr1);
        double dNum2 = Double.parseDouble(doubleStr2);
        double doubleSum = dNum1 + dNum2;

        System.out.println(num1 + " + " + num2 + " = " + intSum);

        System.out.printf("%.2f + %.2f = %.2f\n", dNum1, dNum2, doubleSum);

        sc.close();
    }
}
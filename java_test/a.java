package java_test;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numsToString = scanner.nextLine();
        String reverseNunber = new StringBuilder(numsToString).reverse().toString();

        System.out.println(reverseNunber);

        scanner.close();
    }
}
package java_test;

import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while(n <= 0){
            System.out.println('X');
            n = scanner.nextInt();
        }

        System.out.println(n*(n+1)/2);

        scanner.close();
    }

}
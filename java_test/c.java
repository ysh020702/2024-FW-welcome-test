package java_test;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        int height = scanner.nextInt();

        boolean isPossibie = age < 14 && height < 160;

        if(isPossibie){
            System.out.println('O');
        } else {
            System.out.println('X');
        }
        scanner.close();
    }

}
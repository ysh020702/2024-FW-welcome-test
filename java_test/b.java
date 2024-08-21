package java_test;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        String target = "aeiou";

        if(target.indexOf(first) == -1){
            System.out.println('X');
        }else{
            System.out.println("O");
        }
        
        scanner.close();

    }

}
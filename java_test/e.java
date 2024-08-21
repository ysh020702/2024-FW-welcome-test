package java_test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> thirties = new HashSet<>(Arrays.asList(4,6,9,11));
        int year, month;

        year = scanner.nextInt();
        month = scanner.nextInt();

        boolean isYoon = ((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0;

        if(month == 2){
            if(isYoon) System.out.println(29);
            else System.out.println(28);
        } else {
            if(thirties.contains(month)) System.out.println(30);
            else System.out.println(31);
        }

        scanner.close();
    }

}
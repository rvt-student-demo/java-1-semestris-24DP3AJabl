package rvt;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1;
        int sum = 0;
        int i = 0;
        
        System.out.println("Ievadi 0 lai pabeigt");
        for (; number != 0; i++) {
            System.out.println("Ievadi skaitli: ");
            number = scanner.nextInt();
            System.out.println();
            sum += number;
        }

        System.out.println("skaitlu summa: " + sum);
        System.out.println("skaitlu skaits: " + (i - 1));
    }
}
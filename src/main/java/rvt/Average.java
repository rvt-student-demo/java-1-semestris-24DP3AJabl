package rvt;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("Ievadi pirmo skaitli: ");
        int first = scanner.nextInt();
        System.out.println();

        System.out.println("Ievadi otro skaitli: ");
        int second = scanner.nextInt();
        System.out.println();

        System.out.println("Ievadi treso skaitli: ");
        int third = scanner.nextInt();
        System.out.println();

        sum += first + second + third;

        System.out.println("summa: " + sum);
    }
}

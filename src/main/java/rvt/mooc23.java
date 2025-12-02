package rvt;

import java.util.Scanner;

public class mooc23 {
    public static void main(String[] args){
        //ex1();
        ex2();
    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.print("Ievadi pirmo skaitli: ");
        int first = scanner.nextInt();
        System.out.println();

        System.out.print("Ievadi pedejo skaitli: ");
        int last = scanner.nextInt();
        System.out.println();

        for (int i = first; i <= last; i++) {
            sum += i;
        }

        System.out.println("summa: " + sum);
    }

    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numbers = 0;
        double average = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers: ");
        for (int i = 0 ; ; i++) {
            int number = scanner.nextInt();
            
            if (number == -1) {
                System.out.println("Thx! Bye!");
                numbers = i;
                break;
            } else {
                sum += number;
            }
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        average = sum;
        average /= numbers;
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}

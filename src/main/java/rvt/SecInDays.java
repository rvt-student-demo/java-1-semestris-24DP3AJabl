package rvt;

import java.util.Scanner;

public class SecInDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi dienu skaits: ");
        int dienas = scanner.nextInt();
        System.out.println();

        dienas *= 86400;

        System.out.println("sekundes ievaditas dienas: " + dienas);
    }
}

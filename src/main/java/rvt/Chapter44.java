package rvt;
import java.util.Scanner;
public class Chapter44 {
    public static void main(String[] args) {
        // ex1();
        // ex2();
        // ex3();
        // ex4();
        // ex5();
        // ex6();
        // ex7();
    }
    public static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String full = scanner.nextLine().trim();

        int space = full.indexOf(" ");
        if (space <= 0) {
            System.out.println(full);
            return;
        }

        String first = full.substring(0, space);
        String last = full.substring(space + 1).toUpperCase();

        System.out.println(first + " " + last);
    }
    public static void ex2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String line = scanner.nextLine();

        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }
    public static void ex3() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a name:");
            String line = scanner.nextLine();

            if (line.length() == 0) break;

            String lower = line.toLowerCase();
            String title = "";

            if (lower.startsWith("amy") || lower.startsWith("buffy") || lower.startsWith("cathy"))
                title = "Ms. ";
            else if (lower.startsWith("elroy") || lower.startsWith("fred") || lower.startsWith("graham"))
                title = "Mr. ";

            System.out.println(title + line);
            System.out.println();
        }
    }
    public static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cook time-> ");
        String line = scanner.nextLine();

        int minutes = 0;
        int seconds;

        if (line.length() <= 2) {
            seconds = Integer.parseInt(line);
        } else {
            seconds = Integer.parseInt(line.substring(line.length() - 2));
            minutes = Integer.parseInt(line.substring(0, line.length() - 2));
        }

        System.out.println("Your time->  " + minutes + ":" + String.format("%02d", seconds));
    }
    public static void ex5() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.startsWith("//"))
                System.out.println(line);
        }
    }
    public static void ex6() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your password:");
            String pass = scanner.nextLine();

            if (isAcceptable(pass)) {
                System.out.println("Acceptable password.");
                break;
            } else {
                System.out.println("That password is not acceptable.\n");
            }
        }
    }

    private static boolean isAcceptable(String line) {
        if (line.length() < 7) return false;

        boolean hasUpper = !line.equals(line.toLowerCase());
        boolean hasLower = !line.equals(line.toUpperCase());
        boolean hasDigit = line.matches(".*\\d.*");

        return hasUpper && hasLower && hasDigit;
    }
    public static void ex7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word -->");
        String line = scanner.nextLine();

        int spaces = 0;

        while (line.length() > 0) {
            for (int i = 0; i < spaces; i++) System.out.print(" ");
            System.out.println(line);

            spaces++;
            if (line.length() <= 2) break;
            line = line.substring(1, line.length() - 1);
        }
        
    }
}

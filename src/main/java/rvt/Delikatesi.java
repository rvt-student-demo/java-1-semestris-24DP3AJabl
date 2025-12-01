package rvt;

import java.util.Scanner;

public class Delikatesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String preci = scanner.nextLine();
        System.out.println();

        System.out.print("Ievadi cenu: ");
        double cena = Double.valueOf(scanner.nextLine()); 
        System.out.println();

        System.out.print("Ekspress piegāde (0==nē, 1==jā): ");
        int Epiegade = scanner.nextInt();
        System.out.println();

        double piegade = 0.00;
        if (cena < 10) {
            piegade += 2;
        }

        if (Epiegade == 1) {
            piegade += 3;
        }
        
        System.out.println();
        System.out.println("Rēķins:");
        System.out.println("    " + preci + "    " + cena);
        System.out.println("    piegāde    " + piegade);
        System.out.println("    kopā    " + (cena + piegade));
    }
}

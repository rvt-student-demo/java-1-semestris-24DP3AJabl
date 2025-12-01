package rvt;

import java.util.Scanner;

public class Detalas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int skruvi = 5;
        final int uzgriezni = 3;
        final int paplaksni = 1;
        int sum = 0;
        String eror = "";


        System.out.print("Skruvju skaits: ");
        int Dskruvi = scanner.nextInt();
        System.out.println();

        System.out.print("Uzgrieznu skaits: ");
        int Duzgrieznu = scanner.nextInt();
        System.out.println();

        System.out.print("Paplaksnu skaits: ");
        int Dpaplaksnu = scanner.nextInt();
        System.out.println();
        System.out.println();

        if (Dskruvi > Duzgrieznu) {
            eror += "par maz uzgrieznu ";
        } else if (Dskruvi < Duzgrieznu & Dskruvi * 2 < Dpaplaksnu) {
            eror += "par maz skruvi ";
        }
        if (Dskruvi * 2 > Dpaplaksnu) {
            eror += "par maz paplasksnu ";
        }

        if (eror == "") {
            System.out.println("Prabaudi pasitujumu: " + "Pasitujums ir kartiba");
        }  else {
            System.out.println("Prabaudi pasitujumu: " + eror);
        }

        Dskruvi *= 5;
        Duzgrieznu *= 3;
        Dpaplaksnu *= 1;

        sum += Dskruvi + Duzgrieznu + Dpaplaksnu;

        System.out.println("kopeja cena: " + sum);
    }
}

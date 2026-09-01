package LAB.LAB3;

import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn bruttolønn: ");
        int brutto = input.nextInt();

        double tax = 0.0;
        if (brutto < 0) {
            System.out.println("Invalid value");
        } else if (brutto <= 226100) {
            tax = 0.0;
        } else if (brutto <= 318300) {
            tax = 0.017;
        } else if (brutto <= 725050) {
            tax = 0.04;
        } else if (brutto <= 980100) {
            tax = 0.137;
        } else if (brutto <= 1467200) {
            tax = 0.168;
        } else {
            tax = 0.178;
        }

        double skatt = brutto*tax;
        System.out.print("Total skatt: " + skatt + "kr");
    }
}

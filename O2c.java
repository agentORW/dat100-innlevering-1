package LAB.LAB3;

import java.util.Scanner;

public class O2c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.print("Skriv inn karakterpoeng: ");
            int karakterpoeng = input.nextInt();

            boolean valid = true;

            do {
                if  (karakterpoeng < 0 || karakterpoeng > 100) {
                    System.out.println("Ugyldig karakterpoeng");
                    valid = false;
                    System.out.print("Skriv inn ny karakterpoeng: ");
                    karakterpoeng = input.nextInt();
                } else {
                    valid = true;
                }
            } while (!valid);


            char karakter = 0;
            if (karakterpoeng <= 39) {
                karakter = 'F';
            } else if (karakterpoeng <= 49) {
                karakter = 'E';
            } else if (karakterpoeng <= 59) {
                karakter = 'D';
            } else if (karakterpoeng <= 79) {
                karakter = 'C';
            } else if (karakterpoeng <= 89) {
                karakter = 'B';
            } else {
                karakter = 'A';
            }

            if (valid) System.out.println("Din karakter er: " + karakter);
        }
    }
}

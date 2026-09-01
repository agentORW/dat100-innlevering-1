package LAB.LAB3;

import java.util.Scanner;

public class O2a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn karakterpoeng: ");
        int karakterpoeng = input.nextInt();


        boolean valid = true;
        char karakter = 0;
        if  (karakterpoeng < 0 || karakterpoeng > 100) {
            System.out.println("Ugyldig karakterpoeng");
            valid = false;
        } else if (karakterpoeng <= 39) {
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

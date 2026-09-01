package LAB.LAB3;

import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn et positivt heltall: ");
        int n = input.nextInt();

        boolean valid = true;
        do {
            if (n < 0) {
                valid = false;
                System.out.print("Skriv inn et positivt heltall: ");
                n = input.nextInt();
            } else {
                valid = true;
            }
        } while (!valid);

        int fak = 1;

        for (; n >= 1; n--) {
            fak *= n;
        }

        System.out.println("Faktorial: " + fak);
    }
}

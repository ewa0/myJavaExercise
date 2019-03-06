package piateCw;

import java.util.Scanner;

public class Compare {
    public Compare() {
    }

    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        System.out.println("Podaj liczbe a: ");
        int a = liczba.nextInt();
        System.out.println("Podaj liczbe b: ");
        int b = liczba.nextInt();

        System.out.println("Liczba a to: " + a + "\nLiczba b to: " + b);

        if (a > b) {
            System.out.println("Liczba a jest wieksza niz b.");
        } else if (a < b) {
            System.out.println("Liczba b jest wieksza niz a.");
        } else {
            System.out.println("Liczba a i liczba b sa sobie rowne.");
        }
    }
}

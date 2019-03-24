package szosteCw;

import java.util.Scanner;

public class Imiona {
    public Imiona() {
    }

    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String imie = odczyt.nextLine();
        System.out.println("Podane imie to: " + imie);

        if ("Ewa".equals(imie)) {
            System.out.println("Czesc Ewa!");
        } else if ("Maciek".equals(imie)) {
            System.out.println("Czesc Maciek!");
        } else {
            System.out.println("Nie znam Cie.");
        }
    }
}

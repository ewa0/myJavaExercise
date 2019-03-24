package osmeCw;

import java.util.Scanner;

public class BombExplode {
    public static void main(String[] args) {
        System.out.println("Podaj calkowita liczbe dodatnia: ");
        Scanner odczyt = new Scanner(System.in);
        int a = odczyt.nextInt();
//pierwszy sposob
//        for (int i = a; i>=0 ; i--) {
//            System.out.println("Bomba wybuchnie za: " + i + "\n");
//        }

// drugi sposob
//        while (a >= 0) {
//            System.out.println("Bomba wybuchnie za: " + a + "\n");
//            a--;
//        }

//trzeci sposob
        do {
            System.out.println("Bomba wybuchnie za: " + a + "\n");
            a--;
        }
        while (a >= 0);

    }
}

package dziesiateCw;

import java.util.Scanner;

public class TablicaUzytk {
    public static void main(String[] args) {
        System.out.println("Podaj wymiar tablicy: ");
        Scanner odczyt = new Scanner(System.in);
        int[] tab = new int[odczyt.nextInt()];
        int a;
        //wypelnienie tablicy
        for (int i = 0; i < tab.length; i++) {
            a = i * 2 + 10;
            tab[i] = a;
        }

        //wyswietlanie zawartosci tablicy petla while
        System.out.println("Tablica " + odczyt + "-wymiarowa zawiera liczby:");
        int i = 0;
        while (i < tab.length) {
            System.out.println(tab[i]);
            i++;
        }
    }
}

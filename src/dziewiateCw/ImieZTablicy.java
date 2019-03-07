package dziewiateCw;

import java.util.Scanner;

public class ImieZTablicy {
    public static void main(String[] args) {
        //tworzenie nowej tablicy
        String[] tablica_imion = new String[5];

        //wpisywanie imion do tablicy
        for (int i = 0; i < tablica_imion.length; i++) {
            Scanner odczyt = new Scanner(System.in);
            System.out.println("Podaj imie nr " + i);
            tablica_imion[i] = odczyt.nextLine();
        }

        //wyswietlanie imion z tablicy
        for (int i = 0; i < tablica_imion.length; i++) {
            System.out.println("Witaj " + tablica_imion[i] + "!");
        }
    }
}

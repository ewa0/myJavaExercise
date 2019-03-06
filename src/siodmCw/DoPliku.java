package siodmCw;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class DoPliku {
    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("plik.txt");
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj swoje imie: ");
        String imie = input.nextLine();

        PrintWriter zapis = new PrintWriter("plik.txt");
        zapis.print(imie);
        zapis.close();

        Scanner odczyt = new Scanner(new File("plik.txt"));
        System.out.println(odczyt.nextLine());
    }
}


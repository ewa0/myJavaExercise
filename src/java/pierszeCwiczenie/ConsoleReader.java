package pierszeCwiczenie;

import java.util.Scanner;

public class ConsoleReader {
    public static void main(String[] args) {
        //zczytywanie liczby
        System.out.println("Wpisz liczbe, ktorej silnie chcesz otrzymac: ");
        Scanner scanner = new Scanner(System.in);

        int liczba = readNumber(scanner);

        System.out.println("Wprowadzono " + liczba);

        //liczenie silni
        int result = 0;
        boolean flag = true;
        while (flag) {
            Factorial myFactorialObj = new Factorial();
            try {
                result = myFactorialObj.calculateFactorial(liczba);
                flag = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                liczba = readNumber(scanner);
            }
        }
        System.out.println("Wartosc wyliczonej silni: " + result);
    }

    private static int readNumber(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Podana wartosc " + scanner.next() + " nie jest liczba, wpisz liczbe, gnoju: ");
        }

        return scanner.nextInt();
    }


}

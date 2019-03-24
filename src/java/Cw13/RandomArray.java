package Cw13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {

    public static void main(String[] args) {
        System.out.println("Podaj wymiar tablicy: ");
        Scanner odczyt = new Scanner(System.in);
        int arraySize = odczyt.nextInt();

        int[] tab = getIntArray(arraySize);

        System.out.println(Arrays.toString(tab));
    }

    private static int[] getIntArray(int arraySize) {
        Random rand = new Random();
        int[] tab = new int[arraySize];
        int min = 0;

        for (int i = 0; i < arraySize; i++) {
            tab[i] = rand.nextInt(11) + min;
            if (tab[i] >= 50) {
                for (int j = i; j < arraySize; j++) {
                    tab[j] = 50;
                }
                break;
            }
            min = tab[i];
        }
        return tab;
    }

}

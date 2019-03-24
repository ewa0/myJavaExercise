package Cw13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {

    public static void main(String[] args) {
        RandomArray randomArray = new RandomArray();
        int[] tab;
        tab = negativeSize(randomArray);
        System.out.println(Arrays.toString(tab));
    }

    private static int[] negativeSize(RandomArray randomArray) {
        System.out.println("Podaj wymiar tablicy: ");
        Scanner odczyt = new Scanner(System.in);
        int arraySize = odczyt.nextInt();
        int[] tab;

        try {
            tab = randomArray.getIntArray(arraySize);
        } catch (IllegalArgumentException e) {
            System.out.println("Array size less than zero. Input another number, idiot.");
            tab=negativeSize(randomArray);
        }
        return tab;
    }

    public int[] getIntArray(int arraySize) {
        if (arraySize < 0) {
            throw new IllegalArgumentException();
        }
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

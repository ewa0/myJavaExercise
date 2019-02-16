package pierszeCwiczenie;

public class Factorial {
    public int calculateFactorial(int input) throws IllegalArgumentException{
        if (input < 0) {
            throw new IllegalArgumentException("Jestes idiotą, podaj dodatnią liczbę.");
        }
        int silnia = 1;
        if (input == 0 || input == 1) {
            return 1;
        }
        while (input > 1) {
            silnia = silnia * input;
            input--;
        }
        return silnia;
    }
}

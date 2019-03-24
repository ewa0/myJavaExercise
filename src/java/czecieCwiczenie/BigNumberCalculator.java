package czecieCwiczenie;

import java.math.BigInteger;

public class BigNumberCalculator {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("-2561626559859846848944948498494894040800980489488");
        BigInteger b = new BigInteger("10005264513486512");
//        System.out.println(a.add(b));
        System.out.println("Suma liczb " + a + " i " + b + ": " + a.add(b));
        System.out.println("Różnica liczb " + a + " i " + b + ": " + a.subtract(b));
        System.out.println("Iloczyn liczb " + a + " i " + b + ": " + a.multiply(b));
        System.out.println("Iloraz liczb " + a + " i " + b + ": " + a.divide(b));

    }
}

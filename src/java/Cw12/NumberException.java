package Cw12;

public class NumberException {
    public static void main(String[] args) {
        PapierToaletowy srajtasma=new PapierToaletowy(5, "Dzień dobry");

        Number numberAbc = new NumberExtension();
        int i = numberAbc.intValue();
        System.out.println(i);
        Double[] numbers = {1.0, 2.5, 4.0, 7.6};
        int sum = 0;
        for (int j = 0; j < numbers.length; j++) {

        }
        for (Number number : numbers) {
            sum += (Integer) number;
        }

        System.out.println(sum);
    }
}

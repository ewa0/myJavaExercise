package Cw11;

public class Tab2d {
    public static void main(String[] args) {
        int[][] tab = new int[2][3];
        int a = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = a;
                System.out.println("tab[" + i + "," + j + "]=" + a);
                a++;
            }
        }
    }
}

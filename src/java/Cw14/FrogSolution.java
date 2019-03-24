package Cw14;

public class FrogSolution {

    public int solution(int X, int Y, int D) {

        int jumps = Y - X;
        if ((jumps % D) == 0) {
            return jumps / D;
        } else {
            return jumps / D + 1;
        }
    }
}
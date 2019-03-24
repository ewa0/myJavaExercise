package Cw14;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrogSolutionTest {

    @Test
    public void testSolution() {
        //given
        int X = 10;
        int Y = 85;
        int D = 5;
        int expectedJumps = 15;
        FrogSolution testFrog = new FrogSolution();

        //when
        int result = testFrog.solution(X, Y, D);

        //then
        Assert.assertEquals(result, expectedJumps);
    }

    @Test
    public void testSolutionWhenXandYareEquals() {
        //given
        int X = 80;
        int Y = 80;
        int D = 10;
        int expectedJumps = 0;
        FrogSolution testFrog = new FrogSolution();

        //when
        int result = testFrog.solution(X, Y, D);

        //then
        Assert.assertEquals(result, expectedJumps);
    }
}
package Cw13;


import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RandomArrayTest {

    @Test
    public void testGetIntArray() {
        //given
        RandomArray testArray = new RandomArray();
        int arraySize = 10;

        //when
        int[] intArray = testArray.getIntArray(arraySize);

        //then
        Assert.assertEquals(intArray.length, 10);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetIntArrayForNegativeInput() {
        //given
        RandomArray testArray = new RandomArray();
        int arraySize = -2;

        //when
        int[] intArray = testArray.getIntArray(arraySize);
    }

    @Test
    public void testShouldRandomArrayGrowing() {
        //given
        RandomArray testArray = new RandomArray();
        int arraySize = 10;

        //when
        int[] intArray = testArray.getIntArray(arraySize);

        //then
        for (int i = 1; i < arraySize; i++) {
            Assert.assertTrue(intArray[i] >= intArray[i - 1]);
        }
    }
}
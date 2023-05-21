package com.hillel.reziapov.homeworks.homework15;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ExerciseTest {

    private Exercise exercise;

    @Before
    public void initClass() {
        exercise = new Exercise();
    }

    @Test
    public void countingStonesTest() {

        String jewels = "aA";
        String stones = "aAAbbbb";

        int expectedResult = 3;
        int actuallyResult = exercise.numJewelsInStones(jewels, stones);
        Assert.assertEquals(expectedResult, actuallyResult);
    }

    @Test
    public void numberOfGoodPairsTest() {
        int[] nums = {1, 2, 3, 1, 1, 3};

        int expectedResult = 4;
        int actuallyResult = exercise.numIdenticalPairs(nums);
        Assert.assertEquals(expectedResult, actuallyResult);
    }

    @Test
    public void CountingManyInstancesOfTheWordBalloon() {
        String text = "loonbalxballpoon";

        int expectedResult = 2;
        int actuallyResult = exercise.maxNumberOfBalloons(text);
        Assert.assertEquals(expectedResult, actuallyResult);
    }
}

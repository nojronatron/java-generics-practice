package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MyGenericsTest {
    @Test
    void test_canCountOddInstancesOfAllNumberTypes() {
        var sut = new MyGenerics();
        ArrayList<Integer> india = new ArrayList<>();
        india.add(1);
        india.add(2);
        india.add(3);
        var expectedIndiaResult = 2;
        assertEquals(expectedIndiaResult, sut.countOdds(india));

        ArrayList<Double> delta = new ArrayList<>();
        delta.add(4d);
        delta.add(5d);
        delta.add(6d);
        var expectedDeltaResult = 1;
        assertEquals(expectedDeltaResult, sut.countOdds(delta));

        ArrayList<Float> foxtrot = new ArrayList<>();
        foxtrot.add(7f);
        foxtrot.add(9f);
        foxtrot.add(11f);
        var expectedFoxtrotResult = 3;
        assertEquals(expectedFoxtrotResult, sut.countOdds(foxtrot));
    }
    @Test
    void test_exchangeFirstTwoElementsInAnArray() {
        Integer[] india = {1,2,};
        Integer[] expectedResult = {2,1,};

        var left = 0;
        var right = 1;
        MyGenerics.exchangeElements(india, left, right);
        assertEquals(expectedResult.length, india.length);

        for(int idx=0; idx < expectedResult.length; idx++) {
            assertEquals(expectedResult[idx], india[idx]);
        }
    }

    @Test
    void test_exchangeTwoDifferentElementsInAnArray() {
        Integer[] india = {1,2,3,4,5,};
        Integer[] expectedResult = {1,2,5,4,3,};
        var left = 2;
        var right = 4;

        MyGenerics.exchangeElements(india, left, right);
        assertEquals(expectedResult.length, india.length);

        for(int idx=0; idx < expectedResult.length; idx++) {
            assertEquals(expectedResult[idx], india[idx]);
        }
    }

    @Test
    void test_exchangeTwoDifferentStringElementsInAnArray() {
        String[] india = {"1","2","3","4","5",};
        String[] expectedResult = {"1","2","5","4","3",};

        var left = 2;
        var right = 4;

        MyGenerics.exchangeElements(india, left, right);
        assertEquals(expectedResult.length, india.length);

        for(int idx=0; idx < expectedResult.length; idx++) {
            assertEquals(expectedResult[idx], india[idx]);
        }
    }

    @Test
    void test_findMaximalElementIntegers() {
        ArrayList<Double> empty = new ArrayList<>();
        ArrayList<Integer> india = new ArrayList<>();
        india.add(1);
        india.add(3);
        india.add(5);
        india.add(24);
        india.add(6);

        var start = 2;
        var end = 4;

        var expectedIndex = 0;
        var actualIndexOfMaxElement = MyGenerics.findMaximalElement(empty, start, end);
        assertEquals(expectedIndex, actualIndexOfMaxElement);

        expectedIndex = 3;
        actualIndexOfMaxElement = MyGenerics.findMaximalElement(india, start, end);
        assertEquals(expectedIndex, actualIndexOfMaxElement);

        start = 0;
        end = 2;

        expectedIndex = 2;
        actualIndexOfMaxElement = MyGenerics.findMaximalElement(india, start, end);
        assertEquals(expectedIndex, actualIndexOfMaxElement);
    }
}

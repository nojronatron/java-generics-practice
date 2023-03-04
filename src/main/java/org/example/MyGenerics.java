package org.example;

import java.util.ArrayList;

public class MyGenerics {
    // Write a generic method to count the number of elements in a collection that are odd
    public int countOdds(ArrayList<? extends Number> numbers) {
        int count = 0;
        for(Number number: numbers){
            if (number.doubleValue() % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // write a generic method that exchanges the positions of two different elements in an array
    public static <T> void exchangeElements(T[] list, int left, int right) {
        // store the first element
        T firstItem = list[left];

        // copy the second element to the first element
        list[left] = list[right];

        // overwrite the second element with the stored element
        list[right] = firstItem;
    }

    public static <T extends Comparable<T>> int findMaximalElement(ArrayList<T> elements, int begin, int end) {
        if (elements.size() <= 1) {
            return 0;
        }

        int largestAtIdx = begin;
        T maximalElement = elements.get(begin);

        for(int idx=begin+1; idx <= end; idx++) {
            if (maximalElement.compareTo(elements.get(idx)) < 0) {
                largestAtIdx = idx;
                maximalElement = elements.get(largestAtIdx);
            }
        }

        return largestAtIdx;
    }
}

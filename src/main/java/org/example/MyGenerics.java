package org.example;

import java.util.ArrayList;

//  https://docs.oracle.com/javase/tutorial/java/generics/QandE/generics-questions.html
/*
3. See below
4. Use generics for type-safe, performant code
5. `Pair<Object, Object>`
6. `Comparable<T>`
7. Will not compile because '+' Operator can only be used with primitives
8. Use upper-bounded wildcard (do I need a helper or something?)
9. It will not compile because T can never be defined as a concrete class in type erasure. Or if it does compile there
    will be an unchecked cast situation
10. Yes because Circle IS-A Shape
11. I do not know if it would compile or not
12.
 */
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

//    public Comparable<T> findMaximalElement(ArrayList<? extends Comparable<T>> list, int begin, int end) {
//        var maximalElement = list.get(begin);
//        for(int idx=begin+1; idx <= end; idx++) {
//            var nextElement = list.get(idx);
//            if (nextElement.compareTo(maximalElement) > 0) {
//                maximalElement = nextElement;
//            }
//        }
//        return maximalElement;
//    }
}

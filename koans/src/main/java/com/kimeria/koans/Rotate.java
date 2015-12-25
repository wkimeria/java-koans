package com.kimeria.koans;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem: Rotate an array of n elements to the right by k steps. For example, with n = 7 and k = 3, the array
 * [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class Rotate {
    public static void main(String[] args) {

        Integer[] array1 = {1, 2, 3, 4, 5, 6, 7};
        Integer[] expected1 = {5, 6, 7, 1, 2, 3, 4};
        test(array1, expected1, 3);

        Integer[] array2 = {1, 2};
        Integer[] expected2 = {2, 1};
        test(array2, expected2, 1);

        Integer[] array3 = {};
        Integer[] expected3 = {};
        test(array3, expected3, 1);

    }

    public static void test(Integer[] array, Integer[] expected, int k) {
        Integer[] result = rotateNaive(array, k);
        assert (Arrays.equals(result, expected) == true);
    }

    public static Integer[] rotateNaive(Integer[] arr, int k) {
        if (arr == null || arr.length == 0 || k >= arr.length)
            return arr;

        ArrayList<Integer> newArr = new ArrayList<>();
        int c = arr.length - k;

        do {
            if (c >= arr.length) {
                c = 0;
            }
            Integer i = arr[c];
            newArr.add(i);
            c++;

        } while (c != (arr.length - k));

        Integer[] result = {};

        return newArr.toArray(result);
    }
}

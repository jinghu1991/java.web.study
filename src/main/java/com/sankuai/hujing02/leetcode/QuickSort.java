package com.sankuai.hujing02.leetcode;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2017/1/15 下午1:16
 * Description:
 */

public class QuickSort {

    public static void quickSort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int first, int last) {
        if (first < last) {
            int key = array[first];
            int left = first;
            int right = last;
            while (left < right) {
                while (left < right && array[right] > key) {
                    right--;
                }
                array[left] = array[right];
                while (left < right && array[left] < key) {
                    left++;
                }
                array[right] = array[left];
            }
            array[left] = key;
            sort(array, first, left - 1);
            sort(array, left + 1, last);
        }
    }
}

package com.sankuai.hujing02.leetcode;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2017/1/15 下午1:16
 * Description:
 */

public class SelectionSort {

    public static void selectionSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; ++i) {
            int maxIndex = i;
            for (int j = i + 1; j < length; ++j) {
                if (array[maxIndex] < array[j]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = temp;
            }
        }
    }
}

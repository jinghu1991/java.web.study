package com.sankuai.hujing02.leetcode;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2017/1/15 下午1:16
 * Description:
 */

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int length = array.length;
        for (int i = length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

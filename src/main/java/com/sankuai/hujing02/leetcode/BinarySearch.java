package com.sankuai.hujing02.leetcode;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2017/1/15 下午2:49
 * Description:
 */

public class BinarySearch {

    private static int[] binarySearch(int[] sortedArray, int target) {
        int first = -1, last = -1;
        int left = 0, right = sortedArray.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (sortedArray[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (left < sortedArray.length && sortedArray[left] == target) {
            first = left;
        }

        left = 0;
        right = sortedArray.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (sortedArray[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (right >= 0 && sortedArray[right] == target) {
            last = right;
        }

        int[] result = new int[2];
        result[0] = first;
        result[1] = last;
        return result;
    }

    public static void main(String[] args) {
        int[] sortedArray = new int[] {4,4,4,4};
        binarySearch(sortedArray, 4);
    }
}

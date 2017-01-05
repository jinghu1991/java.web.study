package com.sankuai.hujing02.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/12/9 下午6:30
 * Description:
     Given an array of integers, return indices of the two numbers such that they add up to a specific target.You may assume that each input would have exactly one solution.

     Example:
     Given nums = [2, 7, 11, 15], target = 9,

     Because nums[0] + nums[1] = 2 + 7 = 9,
     return [0, 1].
     UPDATE (2016/2/13):
     The return format had been changed to zero-based indices. Please read the above updated description carefully.
 */

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = new int[] { 3, 2, 4 };
        twoSum(nums, 6);
    }
}

package cn.itcast.hotel;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: zhourx
 * @Date: 2023/9/10
 */

/*
给定一个整数数组 nums 和一个整数目标值 target，
请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int i,j,n = nums.length;
        for (i = 0; i < n-1; i++) {
            for (j = i+1; j < n; j++) {
                if (nums[i] + nums[j]==target) return new int[]{i,j};
            }
        }
        return new int[]{};
    }
}

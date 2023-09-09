package cn.itcast.hotel;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhourx
 * @Date: 2023/9/8
 */

/*
给你两个只包含 1 到 9 之间数字的数组 nums1 和 nums2 ，
每个数组中的元素 互不相同 ，请你返回 最小 的数字，两个数组都 至少 包含这个数字的某个数位。
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {4,1,3}, nums2 = {5,7};
        System.out.println(minNumber(nums1,nums2));
    }
    public static int minNumber(int[] nums1, int[] nums2) {
        boolean[] bool1 = new boolean[10];
        boolean[] bool2 = new boolean[10];
        //将连个数组中所出现的数字标记为true
        for (int x : nums1) {
            bool1[x] = true;
        }
        for (int x : nums2) {
            bool2[x] = true;
        }
        int r1=0,r2=0;
        //从小往大遍历
        for (int i = 0; i < 10; i++) {
            //如果两个数组的有相同的元素，则此元素就是结果
            if ((bool1[i] == true && bool2[i]) == true) return i;
            //如果没有相同元素则进行选取
            if (bool1[i]==true && r1==0) r1 = i;
            if (bool2[i]==true && r2==0) r2 = i;
        }
        return Math.min(r1*10+r2,r2*10+r1);
    }
}


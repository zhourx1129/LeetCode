package leetcode4;

import java.util.Arrays;

/**
 * @author zhourx
 * @date 2023/5/19
 */
public class Solution {
    public static void main(String[] args) {
        int []nums1={3};
        int []nums2={-1,-2};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m + n];
        //保证第一个数组的元素比第二个多
        if (m <= n) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            int t=m;
            m=n;
            n=t;
        }
        //第二个素组无元素
        if (n == 0) {
            if (m % 2 == 0) {
                return (nums1[m / 2] + nums1[m / 2 - 1])/2.0;
            } else {
                return nums1[m / 2];
            }
        }
        //两个素组都有元素
        int i = 0, j = 0, k = 0;
        while (k != m + n) {  //将元素赋值给新素组
            //第二个素组元素拷贝完了
            if (j == n) {
                nums[k++] = nums1[i++];
            }
            //第一个数组拷贝完了
            else if(i==m){
                nums[k++] = nums2[j++];
            }else{
                if (nums1[i] < nums2[j]) {
                    nums[k++] = nums1[i++];
                } else {
                    nums[k++] = nums2[j++];
                }
            }
        }
        if (k % 2 == 0) {
            return (nums[k / 2] + nums[k / 2 - 1])/2.0;
        } else {
            return nums[k / 2];
        }
    }
}

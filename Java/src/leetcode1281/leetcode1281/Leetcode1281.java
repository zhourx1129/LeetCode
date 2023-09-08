package leetcode1281;
// 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。

public class Leetcode1281{
    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.subtractProductAndSum(234);
        System.out.println(result);
    }
}
class Solution {
    public int subtractProductAndSum(int n) {
       int sum=0,product=1;
        while(n!=0){
            product *= n%10;
            sum += n%10;
            n/=10;
        }
        return product-sum;
    }
}
package leetcode62;

import java.util.Scanner;

/**
 * @author zhourx
 * @date 2022/5/27
 * @apiNode
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int res = new Solution().uniquePaths(m, n);
        System.out.println(res);
    }
}
class Solution {
    public static int move(int m,int n,int l,int r){
        //到达终点
        if (l == m && r == n) {
            return 1;
        }
        //超过
        if (l > m || r > n){
            return 0;
        }
        return move(m,n,l+1,r)+move(m,n,l,r+1);
    }
    public int uniquePaths(int m, int n) {
        return move(m,n,1,1);
    }
}

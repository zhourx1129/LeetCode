
/**
 * @Author: zhourx
 * @Date: 2023/9/13
 */
/*
骑士在一张 n x n 的棋盘上巡视。在 有效 的巡视方案中
骑士会从棋盘的 左上角 出发，并且访问棋盘上的每个格子 恰好一次 。
给你一个 n x n 的整数矩阵 grid ，由范围 [0, n * n - 1]
内的不同整数组成，其中 grid[row][col]
表示单元格 (row, col) 是骑士访问的第 grid[row][col] 个单元格。
骑士的行动是从下标 0 开始的。
如果 grid 表示了骑士的有效巡视方案，返回 true；否则返回 false。
*/
public class Solution {
    public static void main(String[] args) {
        int[][] grid = {
                {0,11,16,5,20},
                {17,4,19,10,15},
                {12,1,8,21,6},
                {3,18,23,14,9},
                {24,13,2,7,22}};
        System.out.println(checkValidGrid(grid));
    }
    public static boolean checkValidGrid(int[][] grid) {
        //左上角必须是0
        if (grid[0][0] != 0) {
            return false;
        }
        int k = 1, n = grid.length, i = 0, j = 0;
        while (k < n * n) {
            if ((i + 2) < n && (j + 1) < n && grid[i + 2][j + 1] == k) {
                k++;
                i += 2;
                j++;
            } else if ((i + 2) < n && j >= 1 && grid[i + 2][j - 1] == k) {
                k++;
                i += 2;
                j--;
            } else if ((j + 2) < n && (i + 1) < n && grid[i + 1][j + 2] == k) {
                k++;
                i++;
                j += 2;
            } else if (j>=2 && (i + 1) < n && grid[i + 1][j - 2] == k) {
                k++;
                i++;
                j -= 2;
            } else if ((j + 2) < n && i >= 1 && grid[i - 1][j + 2] == k) {
                k++;
                i--;
                j += 2;
            } else if (j >= 2 && i >= 1 && grid[i - 1][j - 2] == k) {
                k++;
                i--;
                j -= 2;
            } else if (i>=2 && (j + 1) < n && grid[i - 2][j + 1] == k) {
                k++;
                i -= 2;
                j++;
            } else if ((i >= 2 && j >= 1) && grid[i - 2][j - 1] == k) {
                k++;
                i -= 2;
                j--;
            } else
                return false;
        }
        return true;
    }

    

}

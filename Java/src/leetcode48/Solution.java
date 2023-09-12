package cn.itcast.hotel;


/**
 * @Author: zhourx
 * @Date: 2023/9/12
 */

/*给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。*/
public class Solution {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
    public static void rotate(int[][] matrix) {
        int len = matrix.length-1;
        int[][]newMatrix = new int[len+1][len+1];
        for (int i = 0; i <= len; i++) {
            for (int j = 0; j <= len; j++) {
                newMatrix[len-i][j] = matrix[len-j][len-i];
            }
        }
        for (int i = 0; i <= len; i++) {
            for (int j = 0; j <= len; j++) {
                matrix[i][j] = newMatrix[i][j];
            }
        }
        
        for (int i = 0; i <= len; i++) {
            for (int j = 0; j <= len; j++) {
                System.out.printf("%d\t",matrix[i][j]);
            }
            System.out.println();
        }
    }
}

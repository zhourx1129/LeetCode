package cn.itcast.hotel;


import java.util.Arrays;

/**
 * @Author: zhourx
 * @Date: 2023/9/12
 */
/*给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。*/
public class Solution {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
    }
    /*public static void rotate(int[][] matrix) {
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
    }*/

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp;
        //先通过水平轴进行翻转
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < n; j++) {
                temp = matrix[n-1-i][j];
                matrix[n-1-i][j] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        //根据住对称轴进行翻转
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                //对称轴
                if (i == j) {
                    break;
                }
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}

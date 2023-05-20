package leetcode6;

import java.util.Arrays;

/**
 * @author zhourx
 * @date 2023/5/20
 */
public class Solution {
    public static void main(String[] args) {
        convert("PAYPALISHIRING",3);
    }
    public static String convert(String s, int numRows) {
        //只有1行则原样返回
        if(numRows==1){
            return s;
        }
        int len=s.length();
        //控制每个字符所在的行号     1232123
        int []flag=new int[len];
        int move=0;   //移动标志
        flag[0]=1;
        for (int i = 1; i < len; i++) {
            if (flag[i-1]==1)
                move=1;
            else if(flag[i-1]==numRows)
                move=-1;
            flag[i]=flag[i-1]+move;
        }

        int j = 1, n = 0;
        char[] arr = new char[len];
        while(j <= numRows){
            for(int i = 0; i < len; i++){
                //控制每一行有哪些字符
                if(flag[i] == j)
                    arr[n++] = s.charAt(i);
            }
            j++;
        }
        return new String(arr);
    }
}

package leetcode2337;

/**
 * @Author: zhourx
 * @Date: 2023/8/21
 */
class Solution{
    public boolean canChange(String start, String target) {
        int n = start.length();
        int i = 0, j = 0;
        while (i < n && j < n) {
            // 寻找start第一个字符
            while (i < n && start.charAt(i) == '_') {
                i++;
            }
            // 寻找target第一个字符
            while (j < n && target.charAt(j) == '_') {
                j++;
            }
            if (i < n && j < n) {
                // 如果start第一个字符与target第一个字符不同则不匹配
                if (start.charAt(i) != target.charAt(j)) {
                    return false;
                }

                char c = start.charAt(i);
                // 如果start的第一个字符是L，且因为L无法右移，所以如果start的L所在的位置索引小于target的L所在的位置索引则返回不匹配
                // 如果start的第一个字符是R，且因为R无法左移，所以如果start的R所在的位置索引大于target的R所在的位置索引则返回不匹配
                if ((c == 'L' && i < j) || (c == 'R' && i > j)) {
                    return false;
                }
                
                i++;
                j++;
            }
        }
        // start或者target有一个遍历完成
        while (i < n) {
            // 如果target遍历完成，start当前的元素不是_，也就是start还有字符，则不符合要求
            if (start.charAt(i) != '_') {
                return false;
            }
            i++;
        }
        while (j < n) {
            // 如果start遍历完成，tartget当前的元素不是_，也就是target也还有字符，则不符合要求
            if (target.charAt(j) != '_') {
                return false;
            }
            j++;
        }

        // 排除掉所有不符合要求的条件，则能匹配成功
        return true;
    }
}
public class A {
    public static void main(String[] args) {
        String start = "_L__R__R_";
        String target = "L______RR";
        System.out.println(new Solution().canChange(start,target));
    }
}
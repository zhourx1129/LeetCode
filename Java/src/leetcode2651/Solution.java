package leetcode2651;

/*
给你一个正整数 arrivalTime 表示列车正点到站的时间（单位：小时），另给你一个正整数 delayedTime 表示列车延误的小时数。
返回列车实际到站的时间。
注意，该问题中的时间采用 24 小时制。
*/
public class Solution{
	 public static void main(String[] args) {
        int arrivalTime = 13, delayedTime = 11;
        System.out.println(findDelayedArrivalTime(arrivalTime,delayedTime));
    }
     public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return  (arrivalTime+delayedTime)%24;
    }
}
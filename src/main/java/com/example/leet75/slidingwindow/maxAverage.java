package com.example.leet75.slidingwindow;

public class maxAverage {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0.0;
        double cur = 0.0;
        for(int i=0;i<k;i++){
            cur += nums[i];
            max = cur;
        }
        int left=0,right= k-1;
        while(right<nums.length-1){
            cur = cur - nums[left++] + nums[++right];
            max = Math.max(max, cur);
        }
        return max/k;
    }
}

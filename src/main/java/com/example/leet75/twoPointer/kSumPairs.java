package com.example.leet75.twoPointer;

import java.util.Arrays;

public class kSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums.length-1;
        int count =0;
        while (left<right){
            int sum = nums[left]+nums[right];
            if(sum == k){
                count++;
                left++;
                right--;
            }else if(sum<k){
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}

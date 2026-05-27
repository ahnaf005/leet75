package com.example.leet75.stringarray;

public class productArray {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftArr = new int[n];
        leftArr[0] = 1;
        for(int i=1;i<leftArr.length;i++){
            leftArr[i] = leftArr[i-1]*nums[i-1];
        }
        int R = 1;
        for(int i=nums.length-1;i>=0;i++){
            R = R*nums[i+1];
            leftArr[i]=leftArr[i] *R;
        }
        return leftArr;
    }
}

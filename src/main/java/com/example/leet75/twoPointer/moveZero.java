package com.example.leet75.twoPointer;

public class moveZero {
    public void moveZeroes(int[] nums) {
        int i=0, j=1;
        while(j<nums.length){
            if(nums[i]!=0){
                i++;
                j++;
            }else{
                while(nums[j]!=0){
                    j++;
                }
                nums[i]=nums[j];
                nums[j]=0;
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        int nonZeroIndex = 0, temp;

        for(int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }
}

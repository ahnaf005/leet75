package com.example.leet75.binarySearch;

public class findPeak {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = l+ (r-l) / 2;
            if (nums[mid] > nums[mid + 1]) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}

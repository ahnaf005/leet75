package com.example.leet75.slidingwindow;

public class longestSubArr {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int curr = 0;
        int ans = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                curr++;
            }

            while (curr > 1) {
                if (nums[left] == 0) {
                    curr--;
                }

                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}

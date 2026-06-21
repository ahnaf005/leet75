package com.example.leet75.binarySearch;

import java.util.Arrays;

public class successfulPairs {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = potions.length;
        int[] res = new int[spells.length];
        int i=0;
        for(int spell : spells) {
            int idx = binarySearch(potions, spell, success);
            res[i++] = n-idx;
        }
        return res;
    }

    int binarySearch(int[] potions, int spell, long success){
        int n = potions.length;
        int left = 0;
        int right = n-1;
        while(left < right) {
            int mid = left + (right-left)/2;
            long mul = (long)spell*potions[mid];
            if(mul < success) {
                left = mid+1;
            }
            else {
                right = mid;
            }
        }
        return left;

    }
}

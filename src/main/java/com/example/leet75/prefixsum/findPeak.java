package com.example.leet75.prefixsum;

public class findPeak {
    public int largestAltitude(int[] gain) {
        int max = 0, alt = 0;
        for(int g:gain){
            alt +=g;
            max=Math.max(alt,max);
        }
        return max;
    }
}

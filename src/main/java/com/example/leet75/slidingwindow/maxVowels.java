package com.example.leet75.slidingwindow;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class maxVowels {
    public int maxVowels(String s, int k) {
        Set<Character>vowels= new HashSet<>(List.of('a','e','i','o','u'));
        int max = 0;
        int curCnt = 0;
        for(int i=0;i<k;i++){
            if(vowels.contains(s.charAt(i))){
                curCnt++;
            }
        }
        max = curCnt;
        int left=0,right= k-1;
        while(right<s.length()-1){
            if(vowels.contains(s.charAt(left++))){
                curCnt--;
            }
            if(vowels.contains(s.charAt(++right))){
                curCnt++;
            }
            max=Math.max(max,curCnt);
        }
        return max;
    }
}

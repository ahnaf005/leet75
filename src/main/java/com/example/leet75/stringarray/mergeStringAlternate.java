package com.example.leet75.stringarray;

public class mergeStringAlternate {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        StringBuilder res = new StringBuilder();
        while(i< word1.length() && j<word2.length()){
            res.append(word1.charAt(i++));
            res.append(word2.charAt(j++));
        }
        while(i<word1.length()){
            res.append(word1.charAt(i++));
        }
        while(j<word2.length()){
            res.append(word2.charAt(j++));
        }
        return res.toString();
    }
}

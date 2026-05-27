package com.example.leet75.stringarray;

public class reverseWords {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i= words.length-1;i>=0;i--){
            if(words[i].isEmpty()){
                continue;
            }
            res.append(words[i]);
            res.append(" ");
        }
        return res.toString().trim();
    }
}

package com.example.leet75.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class removeStars {
    public String removeStars(String s) {
        Deque<Character>stack = new ArrayDeque<>();
        for(Character ch:s.toCharArray()){
            if(ch == '*'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder str = new StringBuilder();
        for(Character ch:stack){
            str.append(ch);
        }
        return str.reverse().toString();
    }
}

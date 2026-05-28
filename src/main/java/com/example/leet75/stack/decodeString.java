package com.example.leet75.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class decodeString {
    public String decodeString(String s) {
        Deque<Character>stack= new ArrayDeque<>();
        for(char ch: s.toCharArray()){
            if(ch != ']'){
                stack.push(ch);
            }else{
                StringBuilder str = new StringBuilder();
                while(stack.peek()!= '['){
                    str.append(stack.pop());
                }
                str.reverse();
                stack.pop();
                StringBuilder repeat = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    repeat.append(stack.pop());
                }
                StringBuilder res = new StringBuilder();
                res.append(String.valueOf(str).repeat(Integer.parseInt(repeat.reverse().toString())));
                for(char c : res.toString().toCharArray()){
                    stack.push(c);
                }
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}

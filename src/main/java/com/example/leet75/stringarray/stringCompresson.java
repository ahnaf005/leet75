package com.example.leet75.stringarray;

public class stringCompresson {
    public int compress(char[] chars) {
        if(chars.length == 0) return 0;
        StringBuilder res=new StringBuilder();
        char currentChar = chars[0];
        int count = 1;
        for(int i=1;i<chars.length;i++){
            if(chars[i] ==currentChar){
                count++;
            }else{
                if(count ==1){
                    res.append(currentChar);
                }else{
                    res.append(currentChar);
                    res.append(count);
                }
                count=1;
                currentChar = chars[i];
            }
        }
        if(count ==1){
            res.append(currentChar);
        }else{
            res.append(currentChar);
            res.append(count);
        }
        int i = 0;
        for(char ch:res.toString().toCharArray()){
            chars[i++] = ch;
        }
        return chars.length;
    }
}

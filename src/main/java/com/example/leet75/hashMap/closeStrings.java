package com.example.leet75.hashMap;

import java.util.*;

public class closeStrings {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        Map<Character,Integer>map1 = new HashMap<>();
        Map<Character,Integer>map2 = new HashMap<>();
        for(char ch:word1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(char ch:word2.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        for(int value:map1.values()){
            list1.add(value);
        }
        for(int value:map2.values()){
            list2.add(value);
        }
        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);
    }
}

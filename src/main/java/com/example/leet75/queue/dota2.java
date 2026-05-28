package com.example.leet75.queue;

import java.util.LinkedList;
import java.util.Queue;

public class dota2 {
    public String predictPartyVictory(String senate) {
        Queue<Integer>radiant = new LinkedList<>();
        Queue<Integer>dire = new LinkedList<>();
        int n = senate.length();
        for(int i =0;i<senate.length();i++){
            if(senate.charAt(i) =='R'){
                radiant.offer(i);
            }else{
                dire.offer(i);
            }
        }
        while(!radiant.isEmpty() && !dire.isEmpty()){
            int rdx = radiant.poll();
            int ddx = dire.poll();
            if(rdx<ddx){
                radiant.offer(n+rdx);
            }else{
                dire.offer(n+ddx);
            }
        }
        return radiant.isEmpty()?"DIRE":"RADIANT";
    }
}

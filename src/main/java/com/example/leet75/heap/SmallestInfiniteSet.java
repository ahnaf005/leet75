package com.example.leet75.heap;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

class SmallestInfiniteSet {

    PriorityQueue<Integer>minHeap;
    Set<Integer> set;
    int curInt;
    public SmallestInfiniteSet() {
        minHeap = new PriorityQueue<>();
        set = new HashSet<>();
        curInt=1;
    }

    public int popSmallest() {
        int answer;
        if(!minHeap.isEmpty()){
            answer=minHeap.poll();
            set.remove(answer);
        }else{
            answer=curInt;
            curInt++;
        }
        return answer;
    }

    public void addBack(int num) {
        if(curInt<=num || set.contains(num))
            return;
        minHeap.add(num);
        set.add(num);
    }
}

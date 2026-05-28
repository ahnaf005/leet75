package com.example.leet75.queue;

import java.util.LinkedList;
import java.util.Queue;

public class recentCounter {
    class RecentCounter {

        Queue<Integer> time;
        public RecentCounter() {
            time = new LinkedList<>();
        }

        public int ping(int t) {
            time.add(t);
            while(time.peek() <(t-3000)){
                time.remove();
            }
            return time.size();
        }
    }
}

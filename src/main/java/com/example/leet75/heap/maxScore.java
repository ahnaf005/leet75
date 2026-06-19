package com.example.leet75.heap;

import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;

public class maxScore {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        int[][] pairs = new int[n][2];
        for(int i=0;i<n;i++){
            pairs[i] = new int[]{nums1[i],nums2[i]};
        }
        Arrays.sort(pairs, (a,b)->b[1]-a[1]);
        PriorityQueue<Integer>minHeap=new PriorityQueue<>(k);
        long topkSum = 0;
        for(int i=0;i<k;i++){
            minHeap.add(pairs[i][0]);
            topkSum+=pairs[i][0];
        }
        long answer = topkSum*pairs[k-1][1];
        for(int i=k;i<n;i++){
            topkSum -= minHeap.poll();
            topkSum +=pairs[i][0];
            minHeap.add(pairs[i][0]);
            answer = Math.max(answer, topkSum*pairs[i][1]);
        }
        return answer;
    }
}

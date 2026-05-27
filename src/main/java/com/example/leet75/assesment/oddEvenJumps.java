package com.example.leet75.assesment;

import java.util.TreeMap;

public class oddEvenJumps {
    public int oddEvenJumps(int[] arr) {
        int n = arr.length;

        boolean[] higher = new boolean[n];
        boolean[] lower = new boolean[n];

        higher[n - 1] = true;
        lower[n - 1] = true;

        int result = 1;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(arr[n - 1], n - 1);

        for (int i = n - 2; i >= 0; i--) {

            // Odd jump: smallest value >= arr[i]
            Integer ceil = map.ceilingKey(arr[i]);
            if (ceil != null) {
                higher[i] = lower[map.get(ceil)];
            }

            // Even jump: largest value <= arr[i]
            Integer floor = map.floorKey(arr[i]);
            if (floor != null) {
                lower[i] = higher[map.get(floor)];
            }

            if (higher[i]) {
                result++;
            }

            map.put(arr[i], i);
        }

        return result;
    }
}

package com.example.leet75.assesment;

import java.util.*;

public class fruitBasket {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer>map = new HashMap<>();
        int maxSize = 0;
        int startIndex = 0;
        for(int i=0;i<fruits.length;i++){
            map.put(fruits[i],
                    map.getOrDefault(fruits[i], 0) + 1);

            // More than 2 fruit types
            while (map.size() > 2) {

                map.put(fruits[startIndex], map.get(fruits[startIndex]) - 1);

                if (map.get(fruits[startIndex]) == 0) {
                    map.remove(fruits[startIndex]);
                }

                startIndex++;
            }
            maxSize = Math.max(maxSize, i - startIndex + 1);
        }
        return maxSize;
    }
}

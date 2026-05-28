package com.example.leet75.hashMap;

import java.util.HashMap;
import java.util.Map;

public class equalRowPair {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String,Integer>rowMap = new HashMap<>();
        for(int i=0;i<n;i++){
            StringBuilder str= new StringBuilder();
            for(int j=0;j<n;j++){
                str.append(grid[i][j]);
                str.append(",");
            }
            rowMap.put(str.toString(), rowMap.getOrDefault(str.toString(),0) +1);
        }
        int pairs = 0;
        for(int i=0;i<n;i++){
            StringBuilder str= new StringBuilder();
            for(int j=0;j<n;j++){
                str.append(grid[j][i]);
                str.append(",");
            }
            if(rowMap.containsKey(str.toString())){
                pairs += rowMap.get(str.toString());
            }
        }
        return pairs;
    }
}

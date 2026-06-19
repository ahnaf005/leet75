package com.example.leet75.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class reorderEdges {
    int count = 0;

    public void dfs(int node, int parent, Map<Integer, List<List<Integer>>>adj){
        if(!adj.containsKey(node))
            return;
        for(List<Integer>edge:adj.get(node)){
            int neighbour = edge.get(0);
            int sign = edge.get(1);
            if(neighbour!=parent){
                count+=sign;
                dfs(neighbour,node,adj);
            }
        }
    }
    public int minReorder(int n, int[][] connections) {
        Map<Integer, List<List<Integer>>>adj = new HashMap<>();
        for(int[] connection:connections){
            adj.computeIfAbsent(connection[0], k->new ArrayList<List<Integer>>()).add(List.of(connection[1],1));
            adj.computeIfAbsent(connection[1], k->new ArrayList<List<Integer>>()).add(List.of(connection[0],0));
        }
        dfs(0,-1,adj);
        return count;
    }
}

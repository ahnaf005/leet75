package com.example.leet75.dfs;

import java.util.List;

public class visitRoom {

    boolean[] visited;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        visited= new boolean[n];
        visited[0] = true;
        dfs(0,rooms);
        for(int i=0;i<rooms.size();i++){
            if(!visited[i])
                return false;
        }
        return true;
    }

    public void dfs(int index, List<List<Integer>> rooms){
        List<Integer>keys = rooms.get(index);
        for (int room : keys) {
            if (!visited[room]) {
                visited[room] = true;
                dfs(room, rooms);
            }
        }
    }
}

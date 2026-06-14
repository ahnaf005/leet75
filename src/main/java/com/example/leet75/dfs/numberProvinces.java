package com.example.leet75.dfs;

public class numberProvinces {

    boolean[] visited;
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        visited=new boolean[n];
        int count=1;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,isConnected);
                count++;
            }
        }
        return count;
    }

    public void dfs(int index, int[][] isConnected){
        int n=isConnected.length;
        visited[index]=true;
        for(int i=0;i<n;i++){
            if(index!=i && isConnected[index][i] == 1 && !visited[i]){
                visited[i]=true;
                dfs(i,isConnected);
            }
        }
    }


}

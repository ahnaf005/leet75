package com.example.leet75.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class rottenOranges {
    public int orangesRotting(int[][] grid) {
        int len = grid.length;
        int width = grid[0].length;
        Queue<int[]> indices = new LinkedList<>();
        boolean [][] visited = new boolean[len][width];
        for(int i=0;i<len;i++){
            for(int j=0;j<width;j++){
                if(grid[i][j]==2){
                    indices.offer(new int[]{i,j});
                    visited[i][j]=true;
                }
            }
        }
        int count=0;
        while(!indices.isEmpty()){
            int qsize = indices.size();
            for(int i=0;i<qsize;i++){
                int[] index = indices.poll();
                int row= index[0];
                int col=index[1];
                if(row+1 < len && grid[row+1][col] == 1 && !visited[row+1][col]){
                    indices.offer(new int[]{row+1, col});
                    visited[row+1][col]=true;
                    grid[row+1][col]=2;
                }
                if(row-1 >= 0 && grid[row-1][col] == 1 && !visited[row-1][col]){
                    indices.offer(new int[]{row-1, col});
                    visited[row-1][col]=true;
                    grid[row-1][col]=2;
                }
                if(col+1 < width && grid[row][col+1] == 1 && !visited[row][col+1]){
                    indices.offer(new int[]{row, col+1});
                    visited[row][col+1]=true;
                    grid[row][col+1]=2;
                }
                if(col-1 >= 0 && grid[row][col-1] == 1 && !visited[row][col-1]){
                    indices.offer(new int[]{row, col-1});
                    visited[row][col-1]=true;
                    grid[row][col-1]=2;
                }
            }
            if(!indices.isEmpty())
                count++;

        }
        for (int[] ints : grid) {
            for (int j = 0; j < width; j++) {
                if (ints[j] == 1) {
                    return -1;
                }
            }
        }
        return count;
    }
}

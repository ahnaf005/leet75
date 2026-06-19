package com.example.leet75.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class nearestExit {
    public boolean isExist(int len, int width, int[] index){
        if(index[0] == 0 || index[1] == 0 || index[0] == len-1 || index[1] == width-1){
            return true;
        }
        return false;
    }
    public int nearestExit(char[][] maze, int[] entrance) {
        int len = maze.length;
        int width = maze[0].length;
        Queue<int[]>indices = new LinkedList<>();
        boolean [][] visited = new boolean[len][width];
        indices.offer(entrance);
        int count = 0;
        boolean foundExit = false;
        visited[entrance[0]][entrance[1]] = true;
        while(!indices.isEmpty()){
            int qsize = indices.size();
            for(int i=0;i<qsize;i++){
                int[] index = indices.poll();
                int row= index[0];
                int col=index[1];
                if(maze[row][col]=='.' && isExist(len,width,index) && count != 0){
                    foundExit=true;
                    break;
                }
                if(row+1 < len && maze[row+1][col] == '.' && !visited[row+1][col]){
                    indices.offer(new int[]{row+1, col});
                    visited[row+1][col]=true;
                }
                if(row-1 >= 0 && maze[row-1][col] == '.' && !visited[row-1][col]){
                    indices.offer(new int[]{row-1, col});
                    visited[row-1][col]=true;
                }
                if(col+1 < width && maze[row][col+1] == '.' && !visited[row][col+1]){
                    indices.offer(new int[]{row, col+1});
                    visited[row][col+1]=true;
                }
                if(col-1 >= 0 && maze[row][col-1] == '.' && !visited[row][col-1]){
                    indices.offer(new int[]{row, col-1});
                    visited[row][col-1]=true;
                }
            }
            if(foundExit){
                break;
            }
            count++;
        }
        return foundExit?count:-1;
    }
}

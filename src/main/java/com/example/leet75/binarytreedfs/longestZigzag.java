package com.example.leet75.binarytreedfs;

public class longestZigzag {
    int max;
    public int longestZigZag(TreeNode root) {
        max = Integer.MIN_VALUE;
        dfs(root, true, 0);
        dfs(root, false, 0);
        return max;
    }

    void dfs(TreeNode node, boolean goLeft, int steps){
        if(node==null){
            return;
        }
        max = Math.max(steps, max);
        if(goLeft){
            dfs(node.left, false, steps+1);
            dfs(node.right, true, 1);
        }
        else {
            dfs(node.right, true, steps+1);
            dfs(node.left, false, 1);
        }
    }
}

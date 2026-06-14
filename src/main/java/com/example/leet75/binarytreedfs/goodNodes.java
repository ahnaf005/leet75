package com.example.leet75.binarytreedfs;

public class goodNodes {
    int count;
    public int goodNodes(TreeNode root) {
        count = 0;
        dfs(root, Integer.MIN_VALUE);
        return count;
    }

    public void dfs(TreeNode node, int maxVal){
        if(node == null) return;
        if(node.val >= maxVal) count++;
        dfs(node.left, Math.max(maxVal,node.val));
        dfs(node.right, Math.max(maxVal,node.val));
    }
}

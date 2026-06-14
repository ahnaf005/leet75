package com.example.leet75.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class maxLevelSum {
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        int maxSum = Integer.MIN_VALUE;
        int level = 0;
        int res = level;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;
            int curSum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                curSum += node.val;
            }
            if(curSum >maxSum){
                maxSum = curSum;
                res = level;
            }
        }
        return res;
    }
}

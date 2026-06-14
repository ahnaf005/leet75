package com.example.leet75.binarytreedfs;

import java.util.HashMap;
import java.util.Map;

public class pathSum {
    int k;
    Map<Long, Integer>map;
    int count = 0;

    public void targetSum(TreeNode node, long curSum){
        if(node == null) return;
        curSum +=node.val;
        if(curSum == k)
            count++;
        count += map.getOrDefault(curSum-k,0);
        map.put(curSum, map.getOrDefault(curSum,0)+1);
        targetSum(node.left,curSum);
        targetSum(node.right,curSum);
        map.put(curSum, map.get(curSum) - 1);
    }
    public int pathSum(TreeNode root, int targetSum) {
        map = new HashMap<>();
        k=targetSum;
        targetSum(root,0);
        return count;
    }
}

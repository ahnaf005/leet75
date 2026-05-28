package com.example.leet75.hashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDiff {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>list = new ArrayList<>();
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            set2.add(num);
        }
        Set<Integer>list1=new HashSet<>();
        Set<Integer>list2=new HashSet<>();
        for(int num:nums1){
            if(!set2.contains(num)){
                list1.add(num);
            }
        }
        for(int num:nums2){
            if(!set1.contains(num)){
                list2.add(num);
            }
        }
        list.add(list1.stream().toList());
        list.add(list2.stream().toList());
        return list;
    }
}

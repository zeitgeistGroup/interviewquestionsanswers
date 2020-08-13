package com.rac.interviewqna.ds.arrays;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallest {

    public static void main(String[] args) {
        int [] nums={3,1,2,5,4};
        int kth=4;
       // 12345;

    int kthSmallestNumber=kthSmallest(nums,kth);
        System.out.println(kthSmallestNumber);
    }

    private static int kthSmallest(int[] nums, int kth) {

        Queue<Integer> priority=new PriorityQueue<>((o1,o2)->o2.compareTo(o1));
        for(int number:nums){
            priority.add(number);
            if(priority.size()>kth){
                priority.remove();
            }
        }
        return priority.remove();
    }
}

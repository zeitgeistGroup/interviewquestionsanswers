package com.rac.interviewqna.ds.arrays;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargest {

    public static void main(String[] args) {
        int [] nums={3,1,2,5,4};
        int kth=4;

        int kthLargerstNumber=kthLargest(nums,kth);
        System.out.println(kthLargerstNumber);
    }

    private static int kthLargest(int[] nums, int kth) {

        Queue<Integer> priority=new PriorityQueue<>();
        for(int number:nums){
            priority.add(number);
            if(priority.size()>kth){
                priority.remove();
            }
        }
        return priority.remove();
    }
}

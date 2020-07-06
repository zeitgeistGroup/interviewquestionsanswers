package com.rac.interviewqna.ds.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String arg[]){
        int[] nums={2,7,10,12,25};
        int sum=9;
        TwoSum twoSum=new TwoSum();
       for(int i: twoSum.twoSum(nums,sum)){
           System.out.print(i);
       }


    }



    /**
     *
     * @param nums
     * @param sum
     * @return[0.1]
     */

    public int[] twoSum(int[] nums,int sum){
        Map<Integer,Integer> map=new HashMap();


        for(int i=0;i<nums.length;i++){

            if(map.containsKey(sum-nums[i])){
                return new int[] {map.get(sum-nums[i]),i};
            }
            map.put(nums[i],i);

        }
         throw new IllegalArgumentException("no two sum solution");

    }
}

package com.rac.interviewqna.ds.arrays;

public class MoveZero {

    public static void main(String arg[]){

        int [] nums={0,1,0,3,12};
        MoveZero moveZero=new MoveZero();

        view(nums,"view the unaligned numbers");
        view(moveZero.alignedzero(nums),"view the alligned numbers");

    }

    private static void view(int[] nums,String msg) {
        System.out.println("\n"+msg);

        for(int item :nums){
            System.out.print(item);
        }
    }


    /**
     *
     * @param nums  {0,1,0,3,12}
     * @return [1,3,12,0,0]
     */

    public int[] alignedzero(int[] nums){

        int left=0,right=0;

        while(right<nums.length){
            if(nums[right]==0){
                right++;
            }else{
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                right++;
                left++;
            }


        }
        return nums;



    }
}

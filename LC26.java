package com.nowcoder.community.lc;


/**
 *双指针解法
 */
public class LC26 {

    public static int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }

        return i+1;
    }
    public static void main(String[] args) {
        removeDuplicates(new int[]{1,2,3,3,4,4});
    }
}

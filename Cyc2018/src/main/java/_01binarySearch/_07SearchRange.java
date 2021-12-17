package _01binarySearch;

/**
 * @Author: dell5471
 * @Description:
 * 34. Find First and Last Position of Element in Sorted Array
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 *
 * 题目描述：给定一个有序数组 nums 和一个目标 target，要求找到 target 在 nums 中的第一个位置和最后一个位置。
 * @Date: 2021/12/16 11:55
 * @Version: 1.0
 */
public class _07SearchRange {

    public int[] searchRange(int[] nums, int target) {
        int first =findFirst(nums,target);
        int last= findFirst(nums,target+1)-1;
        if(first==nums.length||nums[first]!=target)  return new int[]{-1,-1};
        return new int[]{first,last};

    }


    /**
     * h取值为数组长度的原因是 如果target的值比数组中所有元素都要大，需要返回target的插入位置，应该在数组最大下标后一个位置。
     * @param nums
     * @param target
     * @return
     */
    private int findFirst(int[] nums, int target){
        int l =0,h=nums.length;
        while(l<h){
            int m=l+(h-l)/2;
            if(nums[m]>=target)     h=m;
            else                    l=m+1;
        }
        return l;
    }


}

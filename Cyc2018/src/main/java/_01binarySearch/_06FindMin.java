package _01binarySearch;

/**
 * @Author: dell5471
 * @Description:
 * 153. Find Minimum in Rotated Sorted Array (Medium)
 * Input: [3,4,5,1,2],
 * Output: 1
 * @Date: 2021/12/16 11:17
 * @Version: 1.0
 */
public class _06FindMin{
    /**
     * 关键是写出h=m对应的条件，h=m代表了要找的点在[l,m]之中，要找的点可以是m,也有可能小于m
     * nums[m]>=keys
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1;
        while(l<h){
            int m=l+(h-l)/2;
            if(nums[m]<nums[h])   h=m;
            else                  l=m+1;
        }
        return nums[l];
    }
}

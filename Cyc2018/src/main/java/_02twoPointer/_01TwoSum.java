package _02twoPointer;

import java.util.Arrays;

/**
 * @Author: dell5471
 * @Description:
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 *
 * 题目描述：在有序数组中找出两个数，使它们的和为 target。
 * @Date: 2021/12/16 14:46
 * @Version: 1.0
 */
public class _01TwoSum {
    public static void main(String[] args) {
        int[] a={2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(a,9)));
    }

    /**
     * Arrays.toString()   输出数组最简洁方法
     * @param numbers
     * @param target
     * @return
     */
   public static int[] twoSum(int[] numbers ,int target){
         int i=0,j=numbers.length-1;
         while(i<j){
             int sum =numbers[i]+numbers[j];
             if(sum==target)    return new int[]{i+1,j+1};
             else if(sum<target) i++;
             else   j--;
         }
               return null;
   }

}

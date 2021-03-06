package _01binarySearch;

/**
 * @Author: dell5471
 * @Description: 题目描述：一个有序数组只有一个数不出现两次，找出这个数。
 * 要求以 O(logN) 时间复杂度进行求解，因此不能遍历数组并进行异或操作来求解，这么做的时间复杂度为 O(N)。
 * Input: [1, 1, 2, 3, 3, 4, 4, 8, 8]
 * Output: 2
 * @Date: 2021/12/15 22:11
 * @Version: 1.0
 */
public class _04singleNonDuplicate {
    public static void main(String[] args) {
        int[] a={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(a));
    }

    public static int singleNonDuplicate(int[] nums) {
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (m % 2 == 1) m--;
            if (nums[m] == nums[m + 1]) l = m + 2;
            else h = m;
        }
        return nums[h];
    }

}

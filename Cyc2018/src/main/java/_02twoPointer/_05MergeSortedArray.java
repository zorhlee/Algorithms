package _02twoPointer;

import java.util.Arrays;

/**
 * @Author: dell5471
 * @Description: Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * Output: [1,2,2,3,5,6]
 * 题目描述：把归并结果存到第一个数组上。
 * @Date: 2021/12/16 21:28
 * @Version: 1.0
 */
public class _05MergeSortedArray {
    public static void main(String[] args) {
        int[] a=new int[]{1, 2, 3,0,0,0};
     //   merge(a,3,new int[]{2,5,6},3);
        merge02(a,3,new int[]{2,5,6},3);
        System.out.println(Arrays.toString(a));
    }

    public static void merge(int[] nums1, int m, int[] B, int n) {
        int i, j, k;
        int[] A = Arrays.copyOf(nums1, m);
        for (i = 0, j = 0, k = 0; i < m && j < n; ) {
            if (A[i] >= B[j]) nums1[k++] = B[j++];
            else nums1[k++] = A[i++];
        }
        while (i < m) nums1[k++] = A[i++];
        while (j < n) nums1[k++] = B[j++];

    }

    /**
     * 需要从尾开始遍历，否则在 nums1 上归并得到的值会覆盖还未进行归并比较的值。
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge02(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1, index2 = n - 1;
        int indexMerge = m + n - 1;
        while (index2 >= 0) {
            if (index1 < 0) {
                nums1[indexMerge--] = nums2[index2--];
            } else if (index2 < 0) {
                nums1[indexMerge--] = nums1[index1--];
            } else if (nums1[index1] > nums2[index2]) {
                nums1[indexMerge--] = nums1[index1--];
            } else {
                nums1[indexMerge--] = nums2[index2--];
            }
        }
    }






}

package _01binarySearch;

/**
 * @Author: dell5471
 * @Description: Input : [1,2,3,4,5]
 * key : 3
 * return the index : 2
 * @Date: 2021/12/15 11:45
 * @Version: 1.0
 */
public class _01NormalRealization {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
        System.out.println(binarySearch02(a,3));
    }

    /**
     *未成功查找的返回值
     * 循环退出时如果仍然没有查找到 key，那么表示查找失败。可以有两种返回值：
     * -1：以一个错误码表示没有查找到 key
     * l：将 key 插入到 nums 中的正确位置
     *
     *关于l<=h、h=m-1、l=m+1的分析
     *
     * 第一次判断将数组分成了三个部分[l,m)   [m]    (m,h]
     * h=m-1、l=m+1是因为第一个和第三个区间排除了m
     * l<=h 是为了防止区间为[n,n]的情况
     */
    public static int binarySearch(int[] nums, int key) {
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (nums[m] == key) return m;
            else if (nums[m] > key) h = m - 1;
            else l = m + 1;
        }
        return -1;
    }

    /**
     * 这种方法适合用来找一个数组中从某个数开始以后所有的数都满足同一特征，找满足该特征的第一个数，
     * @param nums
     * @param key
     * @return
     */

    public static int binarySearch02(int[] nums, int key) {
        int l = 0, h = nums.length - 1;
        while (l <h) {
            int m = l + (h - l) / 2;
            if (nums[m] >= key)   h = m ;
            else l = m + 1;
        }
        return l;
    }
}

package _03Sort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * @Author: dell5471
 * @Description: Input: [3,2,1,5,6,4] and k = 2
 * Output: 5
 * @Date: 2021/12/17 20:33
 * @Version: 1.0
 */
public class _03KthElement {
    Random random = new Random();

    public static void main(String[] args) {
        int[] a = {3, 2, 1, 5, 6, 4};
        _03KthElement o = new _03KthElement();
        System.out.println(o.findKthLargest03(a, 2));
    }

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public int findKthLargest03(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();  //小根堆
        for (int val : nums) {
            pq.add(val);
            if (pq.size() > k)
                pq.poll();//返回第一个元素，并从队列中删除第一个元素
        }
        return pq.peek();//返回第一个元素，但不删除
    }


    /**
     * 回忆：快排的时间复杂度为O(n*递归深度）,空间复杂度为O（递归深度）   递归深度最好情况为logn,最坏为n
     * 利用二分法找到partition返回的枢轴元素正好是位于第K大的位置
     * 此方法的时间复杂度为O（n）,调用partition可以看作是个常数
     */
    public int findKthLargest02(int[] nums, int k) {
        k = nums.length - k;
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int j = partition(nums, l, h);
            if (j == k) break;
            else if (j < k) l = j + 1;
            else h = j - 1;
        }
        return nums[k];
    }

    /**
     * 加入随机的过程是为了防止”partition“时遇见有序数列，每次都只能将数组划分为1和n-1，从而时间代价为O（n^2）,
     * 加入随机后，时间的期望为O（n）;
     */
    private int randompartition(int[] a, int l, int h) {
        int i = random.nextInt(h - l + 1) + l;
        swap(a, i, l);
        return partition(a, l, h);
    }

    private int partition(int[] a, int l, int h) {
        int privot = a[l];
        while (l < h) {
            while (l < h && a[h] > privot) h--;
            a[l] = a[h];
            while (l < h && a[l] < privot) l++;
            a[h] = a[l];
        }
        a[h] = privot;
        return h;

    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}

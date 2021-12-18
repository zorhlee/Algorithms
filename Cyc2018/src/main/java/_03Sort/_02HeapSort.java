package _03Sort;

import java.util.Arrays;

/**
 * @Author: dell5471
 * @Description: 大根堆：完全二叉树中，根>=左、右（对比BST 左<=根<=右）
 * 小根堆：完全二叉树中，根<=左、右
 * 选择排序：在每一趟待排元素中选取关键字最大（最小）的元素加入有序子序列
 * 建立大根堆的过程：把所有非终端节点（n/2）检查一遍。
 * @Date: 2021/12/17 14:52
 * @Version: 1.0
 */
public class _02HeapSort {

    public static void main(String[] args) {
        _02HeapSort o = new _02HeapSort();
        int[] a={1,2,5,4,3};
        o.HeapSort(a,5);
        System.out.println(Arrays.toString(a));

        int[] b = {3, 2, 1, 5, 6, 4};
        System.out.println(o.findKthLargest(b, 2));
    }

    /**
     * 时间复杂度O(nlogn)，故渐进时间复杂为 O(n + klog n) =O(n)。
     * 空间复杂度：O(logn)，即递归使用栈空间的空间代价。
     */
    public int findKthLargest(int[] nums, int k){
        buildMaxHeap(nums, nums.length);
        for (int i=nums.length-1;i>=nums.length-k+1;--i){
            swap(nums,i,0);
            maxHeapify(nums,0,i);
        }
        return nums[0];
    }

    /**
     *算法效率：
     * buildMaxHeap  时间复杂度为O（n）
     *排序需要（n-1）次循环，每次循环最多下坠h-1层，所以排序时间复杂度为O（nlogn）
     *空间复杂度为O（1）
     */
    void HeapSort(int[] a,int heapSize){
        buildMaxHeap(a,heapSize);
        for (int i = heapSize-1; i >=0 ; i--) {
            swap(a,i,0);
            maxHeapify(a,0,i);
        }
    }

    public void buildMaxHeap(int[] a, int heapSize) {
        for (int i = heapSize / 2; i >= 0; --i) {
            maxHeapify(a, i, heapSize);
        }
    }

    public void maxHeapify(int[] a, int i, int heapSize) {
        int l = i * 2 + 1, r = i * 2 + 2, largest = i;
        if (l < heapSize && a[l] > a[largest]) {
            largest = l;
        }
        if (r < heapSize && a[r] > a[largest]) {
            largest = r;
        }
        if (largest != i) {
            swap(a, i, largest);   //就一个交换
            maxHeapify(a, largest, heapSize);
        }
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}

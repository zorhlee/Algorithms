package _03Sort;

import java.util.Arrays;

/**
 * @Author: dell5471
 * @Description: 快排
 * @Date: 2021/12/17 14:25
 * @Version: 1.0
 */
public class _01QuickSort {
    public static void main(String[] args) {
        int[] a = {1, 9, 2, 8, 3, 7, 4, 7, 5};
        _01QuickSort o = new _01QuickSort();
        o.QuickSort(a, 0, 8);
        System.out.println(Arrays.toString(a));
    }

    public void QuickSort(int[] A, int l, int h) {
        if (l < h) {
            int pivotposition = Partition(A, l, h);
            QuickSort(A, l, pivotposition - 1);
            QuickSort(A, pivotposition + 1, h);
        }
    }

    private int Partition(int[] A, int l, int h) {
        int pivot = A[l];//可以任意选取枢轴元素
        while (l < h) {
            while (l < h && A[h] >= pivot) --h;
            A[l] = A[h];
            while (l < h && A[l] <= pivot) ++l;
            A[h] = A[l];
        }
        //    System.out.println(l==h);
        A[h] = pivot;
        return h;
    }


}

package _01binarySearch;

/**
 * @Author: dell5471
 * @Description:
 *题目描述：给定一个元素 n 代表有 [1, 2, ..., n] 版本，在第 x 位置开始出现错误版本，导致后面的版本都错误。
 * 可以调用 isBadVersion(int x) 知道某个版本是否错误，要求找到第一个错误的版本。
 * @Date: 2021/12/16 11:06
 * @Version: 1.0
 */
public class _05FirstBadVersion {

    public static int firstBadVersion(int n){
        int l=1,h=n;
        while(l<h){
            int m =l+(h-l)/2;
            if(isBadVersion(m))   h=m;
            else                 l=m+1;
        }

        return l;
    }
   static boolean isBadVersion(int version)
    {return Boolean.TRUE;}
}

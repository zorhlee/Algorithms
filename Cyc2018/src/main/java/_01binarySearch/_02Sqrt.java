package _01binarySearch;

/**
 * @Author: dell5471
 * @Description:
 *Input: 4
 * Output: 2
 *
 * Input: 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we want to return an integer, the decimal part will be truncated.
 * @Date: 2021/12/15 20:59
 * @Version: 1.0
 */
public class _02Sqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    /**
     *为何return h
     *举例：输入8，返回值在2-3之间，返回2
     * m=2时，走的是  l=m+1=3
     * m=3时，走的是  h=m-1=2
     *
     * 不要用乘法，用除法，不要用加法，用减法，防止整数溢出 MAX_VALUE 2147483647
     */
    public static int mySqrt(int x){

        if(x<=1)           return x;
        int l=1,h=x;
        while(l<=h){
            int m=l+(h-l)/2;
            int sqrt=x/m;
            if(sqrt==m)   return m;
            else if(m>sqrt)  h=m-1;
            else            l=m+1;
        }
       return h;

    }


}

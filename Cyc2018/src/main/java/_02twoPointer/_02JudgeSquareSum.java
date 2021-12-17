package _02twoPointer;

/**
 * @Author: dell5471
 * @Description:
 * Input: 5
 * Output: True
 * Explanation: 1 * 1 + 2 * 2 = 5
 * 题目描述：判断一个非负整数是否为两个整数的平方和。
 *
 * 特征 两个值 双指针
 * @Date: 2021/12/16 15:12
 * @Version: 1.0
 */
public class _02JudgeSquareSum {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(2147483600));
    }

    /**
     *
     * @param c
     * @return
     */
    public static boolean judgeSquareSum(int c) {
        long i=0,j= (long) Math.sqrt(c);
        while(i<=j){
            long powSum =(i*i+j*j);
            if(powSum==c)    return true;
            else  if(powSum<c)  i++;
            else                    j--;
        }
        return false;
    }


}

package _02twoPointer;

/**
 * @Author: dell5471
 * @Description: 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 * 输入: s = "abca"
 * 输出: true
 * 解释: 你可以删除c字符。
 * @Date: 2021/12/16 19:26
 * @Version: 1.0
 */
public class _04ValidPalindrome {

    public boolean validPalindrome(String s) {
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return isPalindrome(s,i,j-1)||isPalindrome(s,i+1,j);
            }

        }
         return true;
    }

    private boolean isPalindrome(String s, int i ,int j){
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)) return false;
        }
        return true;
    }

}

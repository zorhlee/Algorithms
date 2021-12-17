package _02twoPointer;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author: dell5471
 * @Description: Given s = "leetcode", return "leotcede".
 * @Date: 2021/12/16 15:47
 * @Version: 1.0
 */
public class _03ReverseVowels {

    /**
     * Arrays.asList()  参数是T... ,给Set集合初始化最快的方式
     * Set中判断是否含有这个元素   hashSet.contains
     * string中判断是否含有某个字符  "aeiouAEIOU".indexOf(ch) >= 0
     * String 和 char[] 的相互转化  new String( )   string.toCharArray()
     */
    private final static HashSet<Character> vowels =
            new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] result = new char[s.length()];
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!vowels.contains(ci)) result[i++] = ci;
            else if (!vowels.contains(cj)) result[j--] = cj;
            else {
                result[i++] = cj;
                result[j--] = ci;
            }
        }
        return new String(result);
    }

}

class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int i = 0, j = n - 1;
        while (i < j) {
            while (i < n && !isVowel(arr[i])) {
                ++i;
            }
            while (j > 0 && !isVowel(arr[j])) {
                --j;
            }
            if (i < j) {
                swap(arr, i, j);
                ++i;
                --j;
            }
        }
        return new String(arr);
    }

    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


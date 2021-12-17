package _01binarySearch;

/**
 * @Author: dell5471
 * @Description: 题目描述：给定一个有序的字符数组 letters 和一个字符 target，
 * 要求找出 letters 中大于 target 的最小字符，如果找不到就返回第 1 个字符。
 * Input:
 * letters = ["c", "f", "j"]
 * target = "d"
 * Output: "f"
 * <p>
 * Input:
 * letters = ["c", "f", "j"]
 * target = "k"
 * Output: "c"
 * @Date: 2021/12/15 21:36
 * @Version: 1.0
 */
public class _03nextGreatestLetter {
    public static void main(String[] args) {
        char[] a = {'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(a, 'j'));
    }

    /**
     * 注意题目中的有序，二分查找法的必要条件
     */
    public static char nextGreatestLetter(char[] letters, char target) {
        int l = 0, h = letters.length;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (letters[m] <= target) l = m + 1;
            else h=m;
        }
        return letters[l % letters.length];
    }

}

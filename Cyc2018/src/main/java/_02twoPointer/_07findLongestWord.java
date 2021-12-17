package _02twoPointer;

import java.util.List;

/**
 * @Author: dell5471
 * @Description: Input:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * Output:
 * "apple"
 * 题目描述：删除s中的一些字符,使得它构成字符串列表 d 中的一个字符串，
 * 找出能构成的最长字符串。如果有多个相同长度的结果，返回字典序最小字符串。
 * @Date: 2021/12/17 10:16
 * @Version: 1.0
 */
public class _07findLongestWord {

    public String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        for (String target : d) {
            int l1 = longestWord.length(), l2 = target.length();
            if (l1 > l2 || l1 == l2 && longestWord.compareTo(target) < 0) continue;
            if (isSubstr(s, target)) longestWord = target;
        }
        return longestWord;
    }

    private boolean isSubstr(String s, String target) {
        int j = 0;
        for (int i = 0; i < s.length() && j < target.length(); i++) {
            if (s.charAt(i) == target.charAt(j)) j++;
        }
        return j == target.length();
    }

}

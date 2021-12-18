package _03Sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: dell5471
 * @Description: Input:
 * "tree"
 * <p>
 * Output:
 * "eert"
 * @Date: 2021/12/18 14:43
 * @Version: 1.0
 */
public class _05frequencySort {

    public static void main(String[] args) {
        _05frequencySort o = new _05frequencySort();
        System.out.println(o.frequencySort("tree"));

    }

    public String frequencySort(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars) map.put(c, map.getOrDefault(c, 0) + 1);
        List<Character>[] buckets = new ArrayList[chars.length + 1];
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char c = entry.getKey();
            int frequency = entry.getValue();
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<Character>();
            }
            buckets[frequency].add(c);
        }
        List<Character> result = new ArrayList<Character>();
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] == null) continue;
            for (Character c : buckets[i]) {
                for (int j = 0; j < i; j++) result.add(c);
            }
        }
        char[] resultString = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            resultString[i] = result.get(i);
        }
        return new String(resultString);
    }
}

import org.junit.Test;

import java.util.*;

/**
 * @Author: dell5471
 * @Description:
 * @Date: 2021/12/15 20:53
 * @Version: 1.0
 */
public class myTest {
    /**
     * Java数组复制
     * System.arraycopy()
     * Arrays.copyOf()
     * Object.clone()
     */

    @Test
    public void test01() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[5];
        System.arraycopy(a, 0, b, 0, 5);

        int[] c = Arrays.copyOf(a, 5);

        int[] d = a.clone();

        System.out.println(Arrays.toString(a));
    }

    @Test
    public void test02() {

        String a = "a";
        String b = "c";
        System.out.println(a.compareTo(b));

    }

    @Test
    public void test03() {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}

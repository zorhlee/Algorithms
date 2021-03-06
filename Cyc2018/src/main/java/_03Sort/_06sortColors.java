package _03Sort;

/**
 * @Author: dell5471
 * @Description:
 * 给定一个包含红色、白色和蓝色，一共n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 *此题中，我们使用整数 0、1 和 2 分别表示红色、白色和蓝色。
 *输入：nums = [2,0,2,1,1,0]
 * 输出：[0,0,1,1,2,2]
 *
 * @Date: 2021/12/18 15:28
 * @Version: 1.0
 */
public class _06sortColors {

    public void sortColors(int[] nums) {
       int zero=-1,one=0,two=nums.length;
       while(one<two){
           if(nums[one]==0)  swap(nums,++zero,one++);
           else if(nums[one]==2)  swap(nums,--two,one);
           else one++;
       }
    }

    public void sortColors02(int[] nums) {
        int zero = 0, one = 0, two = nums.length - 1;
        while (one <= two) {
            if (nums[one] == 0) swap(nums, zero++, one++);
            else if (nums[one] == 2) swap(nums, two--, one);
            else one++;
        }
    }

    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }



}

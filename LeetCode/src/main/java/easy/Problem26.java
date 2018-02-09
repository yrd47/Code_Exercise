package easy;

/**
 * Created by yrd on 2018/2/9.
 */
public class Problem26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        //[0,index]只记录数组中出现的按从小到大的唯一一个数，已经排好序了
        int i = 0;
        int next = 1;

        // 算法思想：找index之后的比A[index]大的数，如是找到就移动到A[index+1]处，
        // index移动到下一个位置，next移动到下一个位置，再找比A[index]大的数
        while (next < nums.length) {
            while (next < nums.length && nums[i] == nums[next]) {
                next++;
            }

            if (next < nums.length) {
                i++;
                nums[i] = nums[next];
                next++;
            }
        }

        return i + 1;
    }
}

package easy;

/**
 * Created by yrd on 2018/2/9.
 */
public class Problem27 {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        int head = 0;
        while (head < nums.length) {
            while (head < nums.length && nums[head] == val) {
                head++;
            }

            if (head < nums.length) {
                nums[i] = nums[head];
                i++;
                head++;
            }
        }
        return i;
    }
}

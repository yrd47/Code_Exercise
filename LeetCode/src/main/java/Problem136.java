/**
 * Created by yrd on 2017/7/12.
 */
public class Problem136 {

    public static void main(String[] args) {
        int[] nums = {5,3,4,6,4,3,6,5,9};
        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        if (nums.length == 1) return nums[0];
        for (int i:
             nums) {
            result ^= i;
            System.out.println(result);
        }
        return result;
    }
}

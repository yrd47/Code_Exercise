package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yrd on 2017/8/1.
 */
public class Problem1 {

    //Two Sum
    //给定一个整数数组，找出其中两个数满足相加等于你指定的目标数字。
    // 要求：这个函数twoSum必须要返回能够相加等于目标数字的两个数的索引，且index1必须要小于index2。请注意一点，你返回的结果（包括index1和index2）都不是基于0开始的。你可以假设每一个输入肯定只有一个结果。

    /**
     * Time complexity: O(n2)
     * Space complexity: O(1)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw  new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int index = 0; index < nums.length; index++) {
            if (map.containsKey((target - nums[index]))) {
                return new int[]{index, map.get(target - nums[index])};
            }
            map.put(nums[index], index);
        }
        throw  new IllegalArgumentException("No two sum solution");
     }
}



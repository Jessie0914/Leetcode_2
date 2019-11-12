/**
 * @ClassName Solution1
 * @Description TODO
 * @Author shishi
 * @Date 2019/9/25 16:32
 **/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Set<Integer> hashSet = new HashSet<Integer>();
        for (int i=0;i<nums.length;i++){
            hashSet.add(nums[i]);
            if (hashSet.contains(target-nums[i])){
                for (int j=0;j<nums.length;j++){
                    if (nums[j]==target-nums[i]&&i!=j){
                        result[0] = i;
                        result[1] = j;
                        Arrays.sort(result);
                        return result;
                    }
                }
            }
        }
        return result;
    }
}

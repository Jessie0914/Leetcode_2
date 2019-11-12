import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Solution15
 * @Description 15. 三数之和
 * @Author shishi
 * @Date 2019/10/15 10:55
 **/

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 *
 * nums = [-1, 0, 1, 2, -1, -4]，
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */
public class Solution15 {
    // 不超时通过所有case的方法
    // 也是用的三个指针，但是移动速度更快，所以没有超时
    // j和k是同时往前往后移动的
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i=0;i<nums.length-2;i++){
            // 去除重复的
            if (i!=0&&nums[i]==nums[i-1])
                continue;
            int j=i+1;
            int k=nums.length-1;
            // 夹逼j和k
            while (j<k){
                // 三数之和比0小，那么往右移动j
                if (nums[i]+nums[j]+nums[k]<0){
                    j++;
                    while (nums[j]==nums[j-1]&&j<k){
                        j++;
                    }
                }
                else if (nums[i]+nums[j]+nums[k]>0){
                    k--;
                    while (nums[k]==nums[k+1]&&j<k){
                        k--;
                    }
                }
                else {
                    res.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                    j++;
                    k--;
                    while (nums[j]==nums[j-1]&&j<k){
                        j++;
                    }
                    while (nums[k]==nums[k+1]&&j>k){
                        k--;
                    }
                }
            }
        }
        return res;
    }

    // 有2个case超时
    // 因为我用的是三个指针，在j和k指针的移动上不够快，没有同时移动
    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        // 利用三个指针(最后2个case超时了，需要进一步分剪枝，其实思路是对的)
        for (int i=0;i<nums.length-2;i++){
            while (i!=0&&nums[i]==nums[i-1]&&i<nums.length-1)
                i++;
            int j=i+1;
            while (j<nums.length-1){
                int k=nums.length-1;
                while (k>j){
                    if (nums[i]+nums[j]+nums[k]<0)
                        break;
                    else if (nums[i]+nums[j]+nums[k]>0)
                        k--;
                    else {
                        res.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                        break;
                    }
                }
                j++;
                while (j<nums.length-1&&nums[j]==nums[j-1]){
                    j++;
                }
            }
        }

        return res;
    }
}

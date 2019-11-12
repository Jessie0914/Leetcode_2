import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void twoSum() {
        Solution1 solution1 = new Solution1();
        int[] nums = {3,3};
        int[] result = solution1.twoSum(nums, 6);
        for (int res : result){
            System.out.println(res);
        }
    }
}
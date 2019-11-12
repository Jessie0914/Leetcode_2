import org.junit.Test;

import java.util.List;

public class Solution15Test {

    @Test
    public void threeSum() {
        Solution15 solution15 = new Solution15();
        int[] nums = {0,0,0,0};
        List<List<Integer>> res = solution15.threeSum(nums);
        for (int i=0;i<res.size();i++){
            List<Integer> list = res.get(i);
            for (int j=0;j<list.size();j++){
                System.out.print(list.get(j)+" ");
            }
            System.out.println();
        }
    }
}
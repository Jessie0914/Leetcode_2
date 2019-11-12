import org.junit.Test;

import static org.junit.Assert.*;

public class Solution435Test {

    @Test
    public void eraseOverlapIntervals() {
        Solution435 solution435 = new Solution435();
        int[][] intervals = {{1,2},{1,3},{2,3},{3,4}};
        int i = solution435.eraseOverlapIntervals(intervals);
        System.out.println(i);
    }
}
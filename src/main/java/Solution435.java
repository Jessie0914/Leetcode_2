/**
 * @ClassName Solution435
 * @Description 435. 无重叠区间
 * @Author shishi
 * @Date 2019/10/17 15:28
 **/

import java.util.Arrays;
import java.util.Comparator;

/**
 * 输入: [ [1,2], [2,3], [3,4], [1,3] ]
 * 输出: 1
 * 解释: 移除 [1,3] 后，剩下的区间没有重叠。
 *
 * 输入: [ [1,2], [1,2], [1,2] ]
 * 输出: 2
 * 解释: 你需要移除两个 [1,2] 来使剩下的区间没有重叠。
 *
 * 输入: [ [1,2], [2,3] ]
 * 输出: 0
 */
public class Solution435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        // 首先先将intervals的数组按照end结束的时间，从小到大排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });

        int count = 0;
        // 然后按照start从小到大的顺序，把相交的数组去除掉
        int i=0;

        while (i<intervals.length){
            int j = i+1;
            while (j<intervals.length&&intervals[j][0]<intervals[i][1]){
                count++;
                j++;
            }
            i = j;
        }

        return count;
    }
}

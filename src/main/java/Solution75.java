/**
 * @ClassName Solution75
 * @Description 75. 颜色分类
 * @Author shishi
 * @Date 2019/11/7 19:06
 **/

/**
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *
 * 输入: [2,0,2,1,1,0]
 * 输出: [0,0,1,1,2,2]
 */

/**
 * 第一次写的时候没有用到“原地”，这其实是一个很经典的算法题，叫做“荷兰国旗问题”
 * 参考网址：https://www.jianshu.com/p/356604b8903f（讲的比官方题解好）
 */
public class Solution75 {
    public void sortColors(int[] nums) {
        int less = -1;
        int more = nums.length;
        int cur = 0;

        while (cur!=more){
            // 如果nums[cur]<middleNum
            // ++less，要保证less先++
            // cur可以直接+1了，因为less是小于middleNum的右边界，可以保证交换过来的数据一定小于middleNum
            if (nums[cur]==0){
                int temp = nums[cur];
                nums[cur++] = nums[++less];
                nums[less] = temp;
            }

            // 如果nums[cur]>middleNum
            // --more，要保证more先--
            // cur仍然保持不变，需要继续比较，因为more是大于middleNum的左边界，交换过来的more-1的数据可能仍然比middleNum大
            else if (nums[cur]==2){
                int temp = nums[cur];
                nums[cur] = nums[--more];
                nums[more] = temp;
            }

            // 如果nums[cur]==middleNum
            // 不需要交换，直接cur+1即可
            else {
                cur++;
            }
        }
    }
}

/**
 * @ClassName Solution7
 * @Description TODO
 * @Author shishi
 * @Date 2019/10/4 16:15
 **/

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 输入: 123
 * 输出: 321
 *
 * 输入: -123
 * 输出: -321
 *
 * 输入: 120
 * 输出: 21
 */
public class Solution7 {
    public int reverse(int x) {
        int res = 0;
        while (x!=0){
            int pop = x%10;
            x/=10;
            if (res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && pop>7))
                return 0;
            if (res<Integer.MIN_VALUE/10 || (res==Integer.MIN_VALUE/10 &&pop<-8))
                return 0;
            res = res * 10 + pop;
        }
        return res;
    }
}

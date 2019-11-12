/**
 * @ClassName Solution9
 * @Description TODO
 * @Author shishi
 * @Date 2019/10/5 10:48
 **/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 输入: 121
 * 输出: true
 *
 * 输入: -121
 * 输出: false
 *
 * 输入: 10
 * 输出: false
 */
public class Solution9 {
    // 题目中要求尽量不用“把整数转换成字符串去处理”的方法，这是我第一次做的时候用的方法，下面使用简洁的官方题解
    // 它的方法是将一个整数不断的取余+除10，那么本身会越来越小，而取余之后反转的数会越来越大
    // 当到最中间的时候，就可以判断这两个数是否相等了，比如说x=1221经过上一步之后，x会变成12，反转的数也会是12。
    // 重点是如何判断取余取到中点了
    public boolean isPalindrome(int x) {
        // 如果x<0或者x非0，但是最后一位是0，那么一定不是回文数
        if (x<0 || (x%10==0&&x!=0))
            return false;

        int reverseNum = 0;
        while (x>reverseNum){
            int temp = x%10;
            // 如果反转数溢出了，就一定不是回文数
            if (reverseNum>Integer.MAX_VALUE/10 || (reverseNum==Integer.MAX_VALUE/10 && temp>7))
                return false;
            reverseNum = reverseNum*10 + temp;
            x /= 10;
        }

        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<>();

        // 如果x原本是奇数位数字，比如说12321，那么最后x=12，reverseNum=123;
        // 如果x原本是偶数为数字，比如说1221，那么最后x=12，reverseNum=12;
        // 所以最后判断x==reverseNum 或者x==reverseNum/10
        return x==reverseNum || x==reverseNum/10;
    }
}

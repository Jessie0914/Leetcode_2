/**
 * @ClassName Solution3
 * @Description TODO
 * @Author shishi
 * @Date 2019/10/2 10:00
 **/

import java.util.HashMap;
import java.util.Map;

/**
 * 输入: "abcabcbb"
 * 输出: 3
 *
 * 输入: "bbbbb"
 * 输出: 1
 *
 * 输入: "pwwkew"
 * 输出: 3
 */
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        // 滑动窗口的思想
        int left=0,right=0;
        int length = s.length();
        char[] charArray = s.toCharArray();
        Map<Character, Integer> hashMap = new HashMap<>();
        int maxLength = 0;
        while (right<length){
            // window窗口添加元素，不断的往后移动right
            char c = charArray[right];
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
            right++;

            // 如果超出1就停止right++，开始left++，直到不满足条件
            while (hashMap.get(c)>1){
                hashMap.put(charArray[left],hashMap.getOrDefault(charArray[left],0)-1);
                left++;
            }

            if (right-left>maxLength){
                maxLength = right-left;
            }
        }
        return maxLength;
    }
}

/**
 * @ClassName Solution8
 * @Description TODO
 * @Author shishi
 * @Date 2019/10/5 9:49
 **/
public class Solution8 {
    public int myAtoi(String str) {
        String s = str.trim();
        if (s.length()==0||
                (!Character.isDigit(s.charAt(0))&&s.charAt(0)!='-'&&s.charAt(0)!='+')){
            return 0;
        }
        int i=0;
        boolean isNegative = false;
        if (s.charAt(0)=='-'){
            isNegative = true;
            i+=1;
        }
        else if (s.charAt(0)=='+'){
            i+=1;
        }

        int result = 0;
        while (i<s.length()){
            if (!Character.isDigit(s.charAt(i))) break;

            int temp = s.charAt(i)-'0';
            if (result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10&&temp>7)) {
                if (isNegative) return Integer.MIN_VALUE;
                else return Integer.MAX_VALUE;
            }

            result = result * 10 + temp;
            i++;
        }

        if (isNegative) return -result;
        else return result;
    }
}

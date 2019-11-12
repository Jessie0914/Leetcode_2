import org.junit.Test;

import static org.junit.Assert.*;

public class Solution8Test {

    @Test
    public void myAtoi() {
        Solution8 solution8 = new Solution8();
        String str = "91283472332";
        int myAtoi = solution8.myAtoi(str);
        System.out.println(myAtoi);
    }
}
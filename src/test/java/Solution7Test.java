import org.junit.Test;

import static org.junit.Assert.*;

public class Solution7Test {

    @Test
    public void reverse() {
        Solution7 solution7 = new Solution7();
        int reverse = solution7.reverse(-2147483648);
        System.out.println(reverse);
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void addTwoNumbers() {
        Solution2 solution2 = new Solution2();
        ListNode l1 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        ListNode l12 = new ListNode(3);
        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(6);
        ListNode l22 = new ListNode(4);
        l1.next = l11;
        l11.next = l12;
        l2.next = l21;
        l21.next = l22;
        ListNode head = solution2.addTwoNumbers(l1, l2);
        System.out.println(head);
    }
}
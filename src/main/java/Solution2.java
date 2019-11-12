/**
 * @ClassName Solution2
 * @Description TODO
 * @Author shishi
 * @Date 2019/9/25 17:13
 **/

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。
 * 其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int carry = 0;
        // 两个都没到尾部的时候
        while (l1!=null&&l2!=null){
            int num1 = l1.val;
            int num2 = l2.val;
            int num;
            if (num1+num2+carry>9){
                num = (carry +num1+num2)%10;
                carry = 1;
            }else {
                num = num1+num2+carry;
                carry = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
            // 创建一个新节点
            ListNode cur = new ListNode(num);
            head.next = cur;
            head = cur;
        }

        // l1还没结束
        while (l1!=null){
            int num = l1.val + carry;
            if (num>9){
                num = num%10;
                carry = 1;
            }else {
                carry = 0;
            }
            ListNode cur = new ListNode(num);
            head.next = cur;
            head = cur;
            l1 = l1.next;
        }

        while (l2!=null){
            int num = l2.val + carry;
            if (num>9){
                num = num%10;
                carry = 1;
            }else {
                num = l2.val;
                carry = 0;
            }
            ListNode cur = new ListNode(num);
            head.next = cur;
            head = cur;
            l2 = l2.next;
        }

        if (carry!=0){
            ListNode cur = new ListNode(1);
            head.next = cur;
        }
        return dummy.next;
    }
}

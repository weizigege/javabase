package solution;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2022-08-15 23:16
 **/
public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        /*while (head != null && head.next.val == val) {
            head = head.next;
        }
        if (head==null){
            return null;
        }*/
        ListNode prev = dummyHead;
        while(prev.next!=null){
        if (prev.next.val==val){
            prev.next=prev.next.next;
        }else {
            prev=prev.next;
        }
        }
        return head;
    }
}

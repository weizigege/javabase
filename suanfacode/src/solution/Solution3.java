package solution;

/**
 * @program: suanfacode
 * @description
 * @author: hu
 * @create: 2022-08-16 22:57
 **/
public class Solution3 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyhead = new ListNode(-1);
        ListNode prev = dummyhead;
        while (list1!=null&&list2!=null){
            if (list1.val<=list2.val){
                prev.next = list1;
                list1 = list1.next;
            }else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        prev.next = list1==null ? list2:list1;
        return dummyhead.next;
    }
}

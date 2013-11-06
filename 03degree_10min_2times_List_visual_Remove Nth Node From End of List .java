public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) { 
        int len = 0;
        ListNode tem = head;
        while(tem != null){
            tem = tem.next;
            len++;
        }
        if(len < n) return null;
        n = len -n ;
        ListNode visualHead = new ListNode(1);
        visualHead.next = head;
        tem = visualHead;
        while(n-- > 0) 
            tem = tem.next; 
        tem.next = tem.next.next;
        return visualHead.next;
    }
}

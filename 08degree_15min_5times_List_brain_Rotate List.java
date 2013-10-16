/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int n) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(n == 0) return head;
        int len = 0 ;
        ListNode tem = head;
        while(tem!=null){
            tem = tem.next;
            len++;
        }
        if(len <= 1) return head;
        n = n%len;
        if(n == 0) return head;
        head = reverseList(head);
        tem = head.next;
        ListNode pre = head;
        while(n--!=1){
            pre = tem;
            tem = tem.next;
        }
        pre.next = null;
        ListNode left = reverseList(tem);
        ListNode right = reverseList(head);
        head.next = left;
        return right;
    }
    public ListNode reverseList(ListNode head){
        if(head == null) return null;
        ListNode p = head ;
        ListNode q = head.next;
        ListNode tem = q;
        head.next = null;
        while(q!=null){
            tem = q.next;
            q.next = p;
            p = q;
            q = tem;
        }
        return p;
    }
}

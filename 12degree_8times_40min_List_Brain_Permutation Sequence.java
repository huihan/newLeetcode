public class Solution {
    public String getPermutation(int n, int k) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(n <= 0) return "";
        int[] arr = factorial(n);
        if(k > arr[n]) return "";
        ListNum list = new ListNum(n);
        StringBuffer buf = new StringBuffer();
        k--;
        for(int i = n-1 ;i >= 0 ; i--){
            int count = k/arr[i];
            k = k%arr[i];
            buf.append(list.get(count));
        }
        return buf.toString();
    }
    public int[] factorial(int n ){
        int[] arr = new int[n+1];
        int tem = 1;
        arr[0] = 1;
        for(int i = 1 ; i <= n ; i++){
            tem *= i;
            arr[i]= tem;
        }
        return arr;
    }
}
class ListNum{
    ListNode listHead = null;
    public ListNum(int n ){
        ListNode head = new ListNode(1);
        listHead = head;
        for(int i = 2; i <= n ;i++){
            head.next = new ListNode(i);
            head = head.next;
        }
    }
    public int get(int i){
        ListNode cur= listHead , pre = listHead;
        if(cur == null) return 0;
        if(i == 0) {
            int res = listHead.val;
            listHead = listHead.next;
            return res;
        }
        while(i>0){
            i--;
            pre = cur;
            cur = cur.next;
        }
        pre.next = cur.next;
        return cur.val;
    }
}
class ListNode{
    int val;
    ListNode next;
    public ListNode(int v){
        val = v;
        next = null;
    }
}

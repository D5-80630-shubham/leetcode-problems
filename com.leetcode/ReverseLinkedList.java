public class ReverseLinkedList {
    public static void main(String[] args) {
        
    }
    public static ListNode reverseList(ListNode head) {
        if(head== null || head.next == null) return head;
        ListNode prev = null;
        ListNode cur = head;
        ListNode curNext = head.next;

        while(curNext!=null){
            cur.next = prev;
            prev = cur;
            cur = curNext;
            curNext = curNext.next;
        }
        cur.next = prev;

        return cur;
    }

}

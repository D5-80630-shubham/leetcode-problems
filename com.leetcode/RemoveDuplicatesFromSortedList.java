public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode node = new ListNode(4);
        deleteDuplicates(node);
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode t1 = head;
        ListNode t2 = head.next;

        while(t2!=null){
            if(t1.val == t2.val){
                t2 = t2.next;
            }else{
                t1.next = t2;
                t1 = t2;
                t2 = t2.next;
            }
        }
        t1.next = t2;

        return head;
    }
}

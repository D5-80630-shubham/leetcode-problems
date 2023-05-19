
public class RemoveNodesFromLinkedList {
    public static void main(String[] args) {

        ListNode node2 = new ListNode(8);
        // ListNode node2 = new ListNode(8,node1);
        ListNode node3 = new ListNode(3,node2);
        ListNode node4 = new ListNode(13,node3);
        ListNode node5 = new ListNode(2,node4);
        // ListNode node6 = new ListNode(1,node5);
        // ListNode node7 = new ListNode(4,node6);
        // ListNode node8 = new ListNode(6,node7);
        // ListNode node9 = new ListNode(3,node8);
        ListNode l1 = new ListNode(5,node5);
        System.out.println(removeNodes(l1).val);
    }
    public static ListNode removeNodes(ListNode head) {
        // ListNode newHead = new ListNode(0);
        // ListNode newTemp = newHead;
        ListNode t1 = head;
        ListNode t2 = head.next;
        ListNode tnew = head;
        while(t2!=null){
            if(t2.val>t1.val){
                tnew.next = t2;
                tnew = tnew.next;
                t1=t2;
                t2 = t2.next;
            }else{
                t1=t2;
                t2 = t2.next;
            }
        }
        if(head.val == head.next.val) return head;
        return head.next;
        
    }    
}


public class RemoveNthInList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
         
        ListNode(int val) { 
            this.val = val; 
        }
        ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; 
        }

        public int add(int i) {
            return 0;
        }
    }
    public static void main(String[] args) {
        // ListNode newNode1 = new ListNode(3);
        // ListNode newNode2 = new ListNode(4,newNode1);
        // ListNode l1 = new ListNode(9);
        
        // ListNode node1 = new ListNode(10);
        // ListNode node2 = new ListNode(9,node1);
        // ListNode node3 = new ListNode(8,node2);
        // ListNode node4 = new ListNode(7,node3);
        // ListNode node5 = new ListNode(6,node4);
        // ListNode node6 = new ListNode(5,node5);
        // ListNode node7 = new ListNode(4,node6);
        // ListNode node8 = new ListNode(3,node7);
        ListNode node9 = new ListNode(1,null);
        ListNode l1 = new ListNode(2,node9);

        System.out.println(removeNthFromEnd(l1,2).val);
        

    }
    public static ListNode  removeNthFromEnd(ListNode head, int n) {
        
        if(head.next==null) return null;
        ListNode t1 = head;
        ListNode t2 = head.next;

        int size = 0;
        while(t1!=null){
            t1 = t1.next;
            size++;
        }
        t1 = head;
        int indexFromStart = size - n;
        if(indexFromStart ==0){
            head=head.next;
        }else{
            while(indexFromStart>1){
                t1=t1.next;
                t2=t2.next;
                indexFromStart--;
            }
            t1.next=t2.next;
        }
       
        

        return head;
    }

}

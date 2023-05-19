// 203
public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode nod1 = new ListNode(6,null);
        ListNode nod2 = new ListNode(5,nod1);
        ListNode nod3 = new ListNode(4,nod2);
        ListNode nod4 = new ListNode(3,nod3);
        ListNode nod5 = new ListNode(6,nod4);
        ListNode nod6 = new ListNode(2,nod5);
        ListNode nod7 = new ListNode(1,nod6);

        System.out.println(removeElements(nod7, 6).val);

    }
    public static ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode temp1 = head;
        ListNode temp2 = head;

        while(temp2!=null){
            if(temp2.val==val){
                temp1.next = temp2.next;
                temp2 = temp2.next;
            }else{
                temp1 = temp2;
                temp2 = temp2.next;
            }
        }
        if(head.val == val ) return head.next;
        return head;        
    }
}

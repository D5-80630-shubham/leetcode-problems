public class MergeTwoSortedLists {
   
    public static void main(String[] args) {
        ListNode newNode1 = new ListNode(3);
        ListNode newNode2 = new ListNode(4,newNode1);
        ListNode list1 = new ListNode(9,newNode2);
        
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(9,node1);
        ListNode node3 = new ListNode(9,node2);
        ListNode node4 = new ListNode(9,node3);
        ListNode node5 = new ListNode(9,node4);
        ListNode node6 = new ListNode(9,node5);
        ListNode node7 = new ListNode(9,node6);
        ListNode node8 = new ListNode(9,node7);
        ListNode node9 = new ListNode(9,node8);
        ListNode list2 = new ListNode(1,node9);

        System.out.println(mergeTwoLists(list1, list2).next.val);
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = new ListNode(0);
        ListNode nextTemp = newHead;
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while(temp1 !=null && temp2 !=null){
            if(temp1.val>temp2.val){
                nextTemp.next = temp2;
                nextTemp = nextTemp.next;
                temp2 = temp2.next;
            }else{
                nextTemp.next = temp1;
                nextTemp = nextTemp.next;
                temp1 = temp1.next;
            }
        }
        while(temp1!=null){
                nextTemp.next = temp1;
                nextTemp = nextTemp.next;
                temp1 = temp1.next;
        }
        while(temp2!=null){
                nextTemp.next = temp2;
                nextTemp = nextTemp.next;
                temp2 = temp2.next;
        }

        return newHead.next;
    }
       
}

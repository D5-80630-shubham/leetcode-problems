public class AddTwoListNode {          
    public static void main(String[] args) {
        // ListNode newNode1 = new ListNode(3);
        // ListNode newNode2 = new ListNode(4,newNode1);
        ListNode l1 = new ListNode(9);
        
        ListNode node1 = new ListNode(9);
        // ListNode node2 = new ListNode(9,node1);
        // ListNode node3 = new ListNode(9,node2);
        // ListNode node4 = new ListNode(9,node3);
        // ListNode node5 = new ListNode(9,node4);
        // ListNode node6 = new ListNode(9,node5);
        // ListNode node7 = new ListNode(9,node6);
        // ListNode node8 = new ListNode(9,node7);
        // ListNode node9 = new ListNode(9,node8);
        ListNode l2 = new ListNode(1,node1);

        System.out.println(addTwoNumbers(l1,l2).val);
        System.out.println(anotherFunction(l1, l2).val);

    }

    public static ListNode anotherFunction(ListNode l1, ListNode l2){
        ListNode newHead = new ListNode(0);
        ListNode tempNode = newHead;
        int carry = 0;

        while(l1 != null || l2 !=null || carry==1){

            int sum=0;
            if(l1 != null){
                sum = sum+l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum = sum+l2.val;
                l2 = l2.next;
            }
            sum = sum+carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10);
            tempNode.next = node;
            tempNode = tempNode.next;

        }


        return newHead.next;
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);
        ListNode tempNode = newHead;
    
        long num1 = returnNums(0, l1);
        long num2 = returnNums(0, l2);
        
        long newNum = num1+num2;
        long eachNode = 0;
        while(newNum>0){
            eachNode = newNum%10;
            int x = (int)eachNode;
            ListNode newNode = new ListNode(x);
            tempNode.next = newNode;
            tempNode = tempNode.next;
            newNum = newNum/10;
        }
        if(newHead.next==null){
            return newHead;
        }else{
            return newHead.next;
        } 
        
    }
    public static long returnNums(int x,ListNode temp){

        long num = x;
        while(temp!=null){
            num = num*10 + temp.val;
            temp = temp.next;
        }
        num = reverseNums(num);
        return num;
    }
    public static long reverseNums(long num){
        
        long nums=0;
        long temp=num;
        while(temp>0){
            nums = nums*10 + temp%10;
            temp=temp/10;
        }
        return nums;
    }
    
}

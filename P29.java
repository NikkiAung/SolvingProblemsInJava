//UsingListNode -> insertFirst - insertLast - ReverseLinkedLis(#leetcode)
import java.util.List;

class P29{
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;

        }

    }

    public void insertFirst(int val){
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;

    }
    public void insertLast(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
        }ListNode current = head;
        while(current.next != null){
            current = current.next;
        }current.next = newNode;

    }

    public void reverse(){
        ListNode current  = head;
        ListNode prev = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }head = prev;
    }
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }System.out.println("null");
    }
    public static void main(String args[]){
        P29 sll = new P29();
        sll.head = new ListNode(0);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        ListNode forth = new ListNode(3);

        sll.head.next = second;
        second.next = third;
        third.next = forth;

        sll.insertLast(11);
        sll.insertLast(12);

        sll.insertFirst(-1);
        sll.insertFirst(-2);
        
        sll.reverse();
        sll.display();
    }
}

//AllLinkListConcept -> insertFirst -> insertLast -> insertByPosition -> reverse
//#dataStructure&Algorithm
public class P30 {
    private ListNode head;
    
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;

        }
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "---->");
            current = current.next;
        }System.out.println("null");
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

    public void insertPosition(int position, int val){
        ListNode node = new ListNode(val);
        if(position == 1){
            node.next = head;
            head = node;
        }else{
            ListNode prev = head;
            int counter = 1;
            while(counter < position-1){
                prev = prev.next;
                counter++;
            }ListNode current = prev.next;
            node.next = current;
            prev.next = node;
        }

    }

    public void reverse(){
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }head = prev;
    }
    public static void main(String args[]){
        P30 sll = new P30();
        sll.head = new ListNode(0);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        ListNode forth = new ListNode(3);


        sll.head.next = second;
        second.next = third;
        third.next = forth;
        System.out.println("Original");
        sll.display();

        sll.insertFirst(-1);
        sll.insertFirst(-2);

        sll.insertLast(4);
        sll.insertLast(5);
        sll.insertLast(7);
        System.out.println("After insertion");
        sll.display();

        System.out.println("After insertion with position");
        sll.insertPosition(9,6);
        sll.display();

        System.out.println("After reversing");
        sll.reverse();
        sll.display();
    }
    
}

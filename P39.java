//finding if input is palindrome or not
class P39{

public boolean isPalindrome(ListNode head){
    if(head == null){
        return true;
    }

    ListNode fast = head;
    ListNode slow = head;

    while(fast.next != null && fast.next.next != null){
        fast = fast.next.next;
        slow = slow.next;
    }

    ListNode firstHalf = head;
    ListNode secondHalf = reverse(slow.next);

    while(firstHalf != null && secondHalf != null){
        if(firstHalf.val != secondHalf.val){
            return false;
        }else{
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
    }return true;


}

private ListNode reverse(ListNode head){
    if(head = null){
        return head;
    }
    ListNode current = head;
    ListNode next = null;
    ListNode prev = null;
    while(current != null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }return prev;
}
}
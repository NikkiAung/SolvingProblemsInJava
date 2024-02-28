//AddingTwoNumberUsingListNodeConcept #leetcode
import java.util.ArrayList;
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class P20 {

    public ListNode addingTwoNum(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            curr.next = new ListNode(sum % 10);
            carry = sum / 10;
            curr = curr.next; // Move curr to the next node
        }
        
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummy.next;
    }

    public static void main(String args[]) {
        int size1, size2;
        int num;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size for 1st array: ");
        size1 = Integer.parseInt(in.nextLine());
        ListNode l1 = new ListNode(0);
        ListNode current = l1;
        for (int i = 0; i < size1; i++) {
            System.out.println("Enter a num: ");
            num = Integer.parseInt(in.nextLine());
            current.next = new ListNode(num);
            current = current.next;
        }
        l1 = l1.next;

        System.out.println("Enter the size for 2nd array: ");
        size2 = Integer.parseInt(in.nextLine());
        ListNode l2 = new ListNode(0);
        current = l2;
        for (int i = 0; i < size2; i++) {
            System.out.println("Enter a num: ");
            num = Integer.parseInt(in.nextLine());
            current.next = new ListNode(num);
            current = current.next;
        }
        l2 = l2.next;

        P20 solution = new P20();
        ListNode res = solution.addingTwoNum(l1, l2);

        ArrayList<Integer> numList = new ArrayList<>();
        while (res != null) {
            numList.add(res.val);
            res = res.next;
        }
        System.out.println(numList);
    }
}

package Medium;

public class AddTwoNumbers {
    
    public static class ListNode {
       
        int val;
        ListNode next;

        ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        return listResponse(l1, l2, 0);
    }

    public ListNode listResponse(ListNode l1, ListNode l2, int number) {

        if (l1 == null && l2 == null && number == 0) {
            return null;
        }
        else if (l1 == null && l2 == null) {
            return new ListNode(number, null);
        }

        ListNode nl1 = null;
        ListNode nl2 = null;

        if (l1 != null) {
            number += l1.val;
            nl1 = l1.next;
        }
        
        if (l2 != null) {
            number += l2.val;
            nl2 = l2.next;
        }

        ListNode listNode = new ListNode(
            number % 10,
            listResponse(nl1, nl2, number / 10)
        );

        return listNode;
    }
}
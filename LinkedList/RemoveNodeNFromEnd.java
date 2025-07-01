package LinkedList;

public class RemoveNodeNFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int l = 0; // length of list node
        while (node != null) {
            node = node.next;
            l++;
        }
        
        if (n-l == 0) // head is the n, return head.next
            return head.next;

        node = head;
        // go to  l-n-1 node
        for (int i = 1; i < l - n; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        
        return head;
    }

public static ListNode removeNthFromEnd2(ListNode head, int n) {
        // Create a dummy node that precedes the head of the list
        ListNode dummyNode = new ListNode(0, head);
      
        // Initialize two pointers, starting at the dummy node
        ListNode fastPointer = dummyNode;
        ListNode slowPointer = dummyNode;
      
        // Move the fast pointer n steps ahead
        while (n-- > 0) {
            fastPointer = fastPointer.next;
        }
      
        // Move both pointers until the fast pointer reaches the end of the list
        while (fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
      
        // Skip the node that is nth from the end
        slowPointer.next = slowPointer.next.next;
      
        // Return the head of the modified list, which is the next node of dummy node
        return dummyNode.next;
    }
     public static void main(String[] args) {
        System.out.println();

        int[] nums = {1,2,3,4,5};
        ListNode head = ListNode.build(nums);
        head = RemoveNodeNFromEnd.removeNthFromEnd(head, 2);
        ListNode.printListNode(head);

        nums = new int[]{1, 2};
        head = ListNode.build(nums);
        head = RemoveNodeNFromEnd.removeNthFromEnd(head, 2);
        ListNode.printListNode(head);

        nums = new int[]{1};
        head = ListNode.build(nums);
        head = RemoveNodeNFromEnd.removeNthFromEnd(head, 1);
        ListNode.printListNode(head);
    }
}

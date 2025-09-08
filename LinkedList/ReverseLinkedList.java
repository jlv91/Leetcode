package LinkedList;

public class ReverseLinkedList {
    public static ListNode reverseListIteratif(ListNode head) {
        if (head == null)
            return head;
        ListNode prev = new ListNode(head.val);
        ListNode current = head.next;
        while (current != null) {
            prev = new ListNode(current.val, prev);
            current = current.next;
        }
        return prev;
    }


     public static void main(String[] args) {
        System.out.println();

        int[] nums = {1,2,3,4,5};
        ListNode head = ListNode.build(nums);
        head = ReverseLinkedList.reverseListIteratif(head);
        System.out.println();
        ListNode.printListNode(head);
    }
}

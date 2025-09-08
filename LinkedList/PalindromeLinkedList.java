package LinkedList;

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode rhead = reverseList(head);
        while (head != null) {
            if (head.val != rhead.val)
                return false;
            head = head.next;
            rhead = rhead.next;
        }

        return true;
    }
    public static ListNode reverseList(ListNode head) {
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

        int[] nums = {1,2};
        ListNode head = ListNode.build(nums);
        System.out.println(PalindromeLinkedList.isPalindrome(head));

        nums = new int[]{1,2,2,1};
        head = ListNode.build(nums);
        System.out.println(PalindromeLinkedList.isPalindrome(head));

    }
}

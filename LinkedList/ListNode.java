package LinkedList;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }


    public static ListNode build(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        ListNode head = new ListNode(nums[0]);
        ListNode prev = head;
        for (int i = 1; i < nums.length; i++) {
            prev.next = new ListNode(nums[i]);
            prev = prev.next;
        }
        return head;
    }

    public static ListNode getListNode(ListNode head, int val) {
        ListNode result = null;
        ListNode node = head;
        while (node != null && result == null) {
            if (node.val == val)
                result = node;
            node = node.next;
        }
        return result;
    }

     public static void printListNode(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}

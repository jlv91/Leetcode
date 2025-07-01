package LinkedList;

public class DeleteNode {
    
    public static void deleteNode(ListNode node) {
        node.val = node.next.val; // node.next is not null because node is not the last one
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        System.out.println();
        int[] nums = {4,5,1,9};
        ListNode head = ListNode.build(nums);
        ListNode.printListNode(head);
        ListNode listNode = ListNode.getListNode(head, 5);
        deleteNode(listNode);

        System.out.println();
        ListNode.printListNode(head);
    }
}

package LinkedList;

public class MergeTwoSortedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head = null;
        ListNode next = null;
        while (list1 != null && list2 != null) {
            if (list2.val <= list1.val) {
                if (head == null) {
                    head = new ListNode(list2.val);
                    next = head;
                }
                else  {
                    next.next = new ListNode(list2.val);
                    next = next.next;
                }
                list2 = list2.next;
            }
            else {
                if (head == null) {
                    head = new ListNode(list1.val);
                    next = head;
                }
                else  {
                    next.next = new ListNode(list1.val);
                    next = next.next;
                }
                list1 = list1.next;
            }
        }
        while (list1 != null) {
            next.next = new ListNode(list1.val);
            next = next.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            next.next = new ListNode(list2.val);
            next = next.next;
            list2 = list2.next;
        }

        return head;
    }

    public static void main(String[] args) {
        System.out.println();

        int[] num1s = {1,2,4};
        int[] num2s = {1,3,4};
        ListNode list1 = ListNode.build(num1s);
        ListNode list2 = ListNode.build(num2s);

        // int[] num1s = {};
        // int[] num2s = {0};
        // ListNode list1 = ListNode.build(num1s);
        // ListNode list2 = ListNode.build(num2s);

        ListNode head = MergeTwoSortedList.mergeTwoLists(list1, list2);
        System.out.println();
        ListNode.printListNode(head);
    }
}

package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet<>();
        while (head != null) {
            if (nodes.contains(head))
                return true;
            nodes.add(head);
            head = head.next;
        }
        return false;
    }
    public boolean hasCycleFloyd(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
       
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;

            if( fast == slow){
                return true;
            }
        }
        return false;
    }
}

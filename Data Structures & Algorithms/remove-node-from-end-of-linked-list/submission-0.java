/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode countTemp = head;
        int count = 0;
        while (countTemp != null) {
            count++;
            countTemp = countTemp.next;
        }
        ListNode moveTemp = head;
        int toRemove = count - n;
        System.out.println(count);
        System.out.println(n);

        System.out.println(toRemove);
        if(toRemove == 0) {
            return head.next;
        }
        for(int i=0; i<toRemove-1; i++) {
            moveTemp = moveTemp.next;
        }
        moveTemp.next = moveTemp.next.next;
        return head;
    }
}

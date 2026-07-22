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
    public boolean hasCycle(ListNode head) {
        HashSet<Integer> list = new HashSet<>();
        ListNode curr = head;
        if(curr == null) {
            return false;
        }
        while(curr.next != null) {
            if(list.contains(curr.val)) {
                return true;
            }
            list.add(curr.val);
            curr = curr.next;
        }
        return false;
    }
}

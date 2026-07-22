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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        List<Integer> toReturn = new ArrayList<>();
        while(temp1 != null) {
            toReturn.add(temp1.val);
            temp1 = temp1.next;
        }
        while(temp2 != null) {
            toReturn.add(temp2.val);
            temp2 = temp2.next;
        }
        if(toReturn.isEmpty()) {
            return null;
        }
        toReturn.sort(null);
        ListNode head = new ListNode(toReturn.get(0));
        ListNode curr = head;
        for(int i=1; i<toReturn.size(); i++) {
            curr.next = new ListNode(toReturn.get(i));
            curr = curr.next;
        }
        
        return head;
    }
}
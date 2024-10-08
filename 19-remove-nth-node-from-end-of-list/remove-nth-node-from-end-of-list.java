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
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode first = dummyNode;
        ListNode last = dummyNode;

        for(int i=0; i<=n; i++){
            first = first.next;
        }
        while(first != null){
            first = first.next;
            last = last.next;
        }
        last.next = last.next.next;
        return dummyNode.next;
    }
}
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // ListNode res = new ListNode();
        // if(l1.val < l2.val){
        //     res.val = l1.val;
        // }
        // else{
        //     res.val = l2.val;
        // }

        // System.out.println(res);
        // while(l1.next != null && l2.next != null){
        //     if(l1.val < l2.val){

        //     }
        //     else if(l2.val < l1.val){

        //     }
        //     else{

        //     }
        // }

        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
        
    }
}
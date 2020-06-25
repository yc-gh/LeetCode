// https://leetcode.com/problems/palindrome-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        
        ListNode fast = head, slow = head;
        
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        if(fast!=null)
        {
            slow = slow.next;
        }
     
        slow = reverse(slow);
        fast = head;
        
        while(slow!=null)
        {
            if(fast.val != slow.val)
            {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        
        return true;
    }
    
    static ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        while(head!=null)
        {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        return prev;
    }
}
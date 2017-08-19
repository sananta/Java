/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    //this function determines if listNode is null, and based on that assigns int p a value
    public int valueIfNull(ListNode x) {
        int p = (x!=null) ? x.val : 0; 
        return p; 
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); //dummyHead listNode makes easy to return because always in BEGINNING
        ListNode current = dummyHead, x = l1, y = l2; //equaling two ListNodes, is the start of creating a list
        int carry = 0; 
        while (x!= null || y!=null) { //check to make sure both ListNodes are not empty
            int p = valueIfNull(x);
            int q = valueIfNull(y);
            if (p+q+carry < 10) current.next = new ListNode(p+q+carry); //if the sum is less than 10, assign value
            else current.next = new ListNode((p+q+carry)%10); //if not, assign the modular value
            carry = (p+q+carry)/10; //if p+q+carry is greater than 10, the carry will be 1, carry can either be 0 or 1
            //for the next while loop iteration 
            if(x!=null) x = x.next; 
            if(y!=null) y = y.next;
            current = current.next;
        }
        //if carry is still left over, make a new node and assign its value to it
        if (carry == 1) current.next = new ListNode(carry);
        return dummyHead.next; 
    }
        
        
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionOfList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int count1 = getCount(headA);
        int count2 = getCount(headB);
        
        if(count1 > count2) {
            int diff = count1-count2;
            return intersection(diff, headA, headB);
        }
        else {
            int diff = count2-count1;
            return intersection(diff, headB, headA);
        }
    }
    
    public int getCount(ListNode node) {
        ListNode current = node;
        int count = 0;
        
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    
    public ListNode intersection(int diff, ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ListNode currentB = headB;
        
        for(int i=0;i<diff;i++) {
            if(currentA == null) {
                return null;
            }
            currentA = currentA.next;
        }
        
        while(currentA != null && currentB != null) {
            if (currentA == currentB) {
                return currentA;
            }
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return null;
    }
}

/*
You are given two ListNodes of a doubly linked list. Write a function pop_tail which removes the tail of the linked list in O(1) time.
Return the head and tail of the linked list as a list. If the linked list is empty after removal, return None.

A ListNode is defined as:
class ListNode:
  value: ListNode = None
  next: ListNode = None
  prev: ListNode = None
Example:
Input:
3 -> 2 -> 4 -> 5 -> 7
head = ListNode(3)
tail = ListNode(7)
Output:
pop_tail(head: ListNode, tail:ListNode) -> [ListNode(3), ListNode(5)]
 */
public class PopTail {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode(int val, ListNode next, ListNode prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public static ListNode[] pop_tail(ListNode head, ListNode tail) {
        if(head == tail) {
            return null;
        }
        tail.prev.next = null;
        tail = tail.prev;
        return new ListNode[]{head, tail};
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3, null, null);
        ListNode one = new ListNode(2, null, head);
        ListNode two = new ListNode(4, null, one);
        one.next = two;
        ListNode three = new ListNode(5, null, two);
        two.next = three;
        ListNode tail = new ListNode(7, null, null);
        three.next = tail;
        tail.prev = three;

        ListNode[] result = pop_tail(head, tail);
        if(result != null) {
            System.out.println(result[0].val);
            System.out.println(result[1].val);
        }
    }
}

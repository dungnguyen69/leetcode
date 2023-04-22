package leetcode;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		//head node is used to point to the next nodes in the linked list. 
		//Therefore, this method returns head node
		ListNode head = new ListNode(0);
		ListNode l3 = head;
		int carry = 0;
		while (l1 != null || l2 != null) {

			int l1_val = (l1 != null) ? l1.val : 0;
			int l2_val = (l2 != null) ? l2.val : 0;

			int sum = l1_val + l2_val + carry;
			carry = sum / 10;
			int last_digit = sum % 10;

			ListNode newNode = new ListNode(last_digit);
			l3.next = newNode;

			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
			l3 = l3.next;
		}
		//If last number is greater than 10, add 1
		if (carry > 0) {
			ListNode newNode = new ListNode(carry);
			l3.next = newNode;
			l3 = l3.next;
		}
		return head.next;
		// l1: 9999999
		// l2: 9999
		// l3:
	}
}

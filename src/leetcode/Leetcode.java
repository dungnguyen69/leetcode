package leetcode;

public class Leetcode {

	public static void main(String[] args) {
			Solution solution = new Solution();
			ListNode result = new ListNode();
		 	ListNode first=new ListNode(2);
	        ListNode second=new ListNode(4);
	       
	        first.next=second;

	        //adding a new ListNode at the first ListNode.Just for checking my understanding.
//	        ListNode newfirst=new ListNode(6);
//	        newfirst.next=first;

	        //second list// second operand is 84467
	        ListNode root=new ListNode(5);
	        ListNode firs=new ListNode(6);
	        ListNode secon=new ListNode(8);
	        
	        root.next=firs;
	        firs.next=secon;
	        result= solution.addTwoNumbers(first,root);
	        while (result != null) {
	        	  System.out.println(result.val);
	        	  result = result.next;
	        	}
	}

}

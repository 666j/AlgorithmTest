package toSum;

public class Solution {

	/**
	 * @param args
	 */
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    	ListNode firstNode = new ListNode(0),resNode = firstNode;
	        ListNode q = l1,p = l2;
	        int carry = 0;
		        while(q!=null||p!=null){
		            int qval = (q !=null)?q.val:0;
		            int pval = (p != null)?p.val:0;
		            int sum =carry+pval+qval;
		            carry = sum/10;
		            int resval = sum%10;
		            System.out.print(sum+","+qval+","+pval);
		            System.out.println();
		            resNode.next = new ListNode(resval);
		            resNode = resNode.next;
		            if (p != null) p = p.next;
	                if (q != null) q = q.next;
		        }
		        System.out.println();
		        return firstNode.next;
	         
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		ListNode f1 = new ListNode(3);
		ListNode f2 = new ListNode(7);
		ListNode l2 = f2,l1= f1;
		int arr1[] = {2,4,3};
		int arr2[]={5,6,4};
		while(i<3){
			l2.next = new ListNode(arr2[i]);
			l1.next = new ListNode(arr1[i]);
			i++;
			l1 = l1.next;
			l2 = l2.next;
		}
		Solution solution = new Solution();
		ListNode listNode = solution.addTwoNumbers(f1.next, f2.next);
		while(listNode!=null){
			System.out.print("->"+listNode.val);
			listNode = listNode.next;
		}
	}

}
  class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
 }
	 
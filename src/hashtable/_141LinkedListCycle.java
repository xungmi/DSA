package hashtable;

import java.util.HashMap;
import java.util.HashSet;

public class _141LinkedListCycle {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	//two pointer
	public static boolean hasCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ListNode nod1 = new ListNode(1);
		ListNode nod2 = new ListNode(2);
		ListNode nod3 = new ListNode(3);
		ListNode nod4 = new ListNode(4);
		nod1.next = nod2;
		nod2.next = nod3;
		nod3.next = nod4;
//		nod4.next = nod2;

		System.out.println(hasCycle(nod1));
	}
}

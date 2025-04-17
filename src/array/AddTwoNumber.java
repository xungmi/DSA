package array;

/*
Đọc đề 2 lần
Xác định
	 input: 2 non-empty linked list : số nguyên ko âm
	 		lưu trữ theo thứ tự ngược
	 		ko có leading zero, nếu có thì [0]

	output
Tìm các ràng buộc
Xác minh ví du
*/


public class AddTwoNumber {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode current = dummyHead;
		int carry = 0;

		while (l1 != null || l2!= null){
			int x = (l1 != null) ? l1.val : 0;
			int y = (l2 != null) ? l2.val : 0;

			int total = x + y + carry;
			int value = total % 10;
			carry = total/10;

			current.next = new ListNode(value);
			current = current.next;

			if (l1 != null) {
				l1 = l1.next;
			}

			if (l2 != null) {
				l2 = l2.next;
			}
		}

		if ( carry > 0) {
			current.next = new ListNode(carry);
		}

		return dummyHead.next;
	}
}

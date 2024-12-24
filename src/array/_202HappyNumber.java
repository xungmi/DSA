package array;

public class _202HappyNumber {
	public int getNext(int n){
		int sum = 0;
		while (n > 0){
			int donvi = n%10;
			sum += (int) Math.pow(donvi, 2);
			n = n /10;
		}
		return sum;
	}
	public boolean isHappy(int n) {
		int slow = n;
		int fast = getNext(n);

		while (fast != slow && fast != 1){
			slow = getNext(slow);
			fast = getNext(getNext(fast));
		}

		return fast == 1;
	}
}

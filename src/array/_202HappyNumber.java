package array;

public class _202HappyNumber {
	public boolean isHappy(int n) {
		if (n == 1) {
			return true;
		}

		if (n >= 2 && n <= 9){
			return false;
		}

		int sum = 0;
		while (n > 0){
			int donvi = n%10;
			sum += (int) Math.pow(donvi, 2);
			n = n /10;
		}
		return isHappy(sum);
	}
}

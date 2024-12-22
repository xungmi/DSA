package array;

import java.util.Arrays;

public class PlusOne {
	public static int[] addOne(int[] digits){
		//9 => 10
		// [1,2,9] => 130
		//199=> 200
		int carry = 0;
		for (int i = digits.length-1; i >= 0; i--){
			if (i == digits.length-1){
				digits[i]++;
			}
			digits[i] = digits[i] + carry;
			if (digits[i]==10){
				digits[i] = 0;
				carry = 1;
			} else {
				carry = 0;
			}
		}

		if (carry == 1){
			int[] newArr =  new int[digits.length+1];
			newArr[0] = carry;
			System.arraycopy(digits, 0, newArr,   1, digits.length);
			return newArr;
		} else {
			return digits;
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3};
		System.out.println(Arrays.toString(addOne(arr)));
	}
}


public class AddBinary {
	public String addBinary(String a, String b) {
		int a_last_id = a.length() - 1;
		int b_last_id = b.length() - 1;

		if (a_last_id < 0) {
			return b;
		}

		if (b_last_id < 0) {
			return a;
		}

		StringBuilder stringBuilder = new StringBuilder();
		int carry = 0;

		while (a_last_id >= 0 || b_last_id >= 0) {

			char char_a = (a_last_id >= 0) ? a.charAt(a_last_id) : '0';
			char char_b = (b_last_id >= 0) ? b.charAt(b_last_id) : '0';

			int value_a = char_a - '0';
			int value_b = char_b - '0';

			int value = value_a + value_b + carry;

			if (value >= 2) {
				carry = 1;
				value = value % 2;
			} else {
				carry = 0;
			}
			stringBuilder.append(value);
			a_last_id--;
			b_last_id--;
		}
		if (carry > 0) {
			stringBuilder.append(carry);
		}

		return stringBuilder.reverse().toString();
	}
}
package array;

public class _2381ShiftingLetterII {
	public static String shiftingLetters(String s, int[][] shifts) {
		StringBuilder builder = new StringBuilder(s);

		int[] shiftCounts = new int[s.length()+1];
		for (int[] shift : shifts){
			int start = shift[0];
			int end = shift[1];
			int direction = shift[2]==0?-1 : 1;

			shiftCounts[start] += direction;
			shiftCounts[end+1] -= direction;
		}

		//prefix sum
		for (int i = 1; i < shiftCounts.length; i++){
			shiftCounts[i] += shiftCounts[i-1];
		}

		for (int i = 0; i < s.length(); i++){
			char ch = builder.charAt(i);
			int shift = shiftCounts[i]%26;
			char newChar = (char)(ch + shift);
			if (newChar < 97){
				newChar += 26;
			} else if (newChar > 122){
				newChar -= 26;
			}
			builder.setCharAt(i, newChar);
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		int[][] shifts = new int[][]{
				{0,1,0},
				{1,2,1},
				{0,2,1}
		};
		String s = "abc";
		System.out.println(shiftingLetters(s, shifts));
	}
}

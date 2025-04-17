package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class _506RelativeRanks {
	public static String[] findRelativeRanks(int[] score) {
		HashMap<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 0 ; i < score.length; i++){
			map.put(score[i], i);
		}

		Arrays.sort(score);
		String[] ans = new String[score.length];
		for (int i = score.length-1; i >= 0; i--){
			int orderInput = map.get(score[i]);
			if (i == score.length-1){
				ans[orderInput] = "Gold Medal";
			} else if (i == score.length-2){
				ans[orderInput] = "Silver Medal";
			} else if (i == score.length-3){
				ans[orderInput] = "Bronze Medal";
			} else {
				ans[orderInput] = Integer.toString(score.length-i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] score = new int[]{5,4,3,2,1};
		System.out.println(Arrays.toString(findRelativeRanks(score)));
	}
}

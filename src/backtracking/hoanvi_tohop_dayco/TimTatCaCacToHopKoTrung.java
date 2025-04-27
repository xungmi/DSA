package backtracking.hoanvi_tohop_dayco;

import java.util.ArrayList;
import java.util.List;

/*
Tìm tất cả các tổ hợp gồm 2 số từ [1, 2, 3]
start = 0 , path = []
	i = 0=> 2
		i = 0
			path = [1]
			backtrack
				i= start=1,path = [1]
					path = [1,2]
					backtrack start = 2, path = [1,2] return
					pop
				i = 2, path=[1]
					path = [1,3]
					backtrack start = 3, path = [1,3] return
					pop
				i = 3 => end  backtrack
			pop
		i =  1
			path = [2]
			backtrack
				i = start = 2, path = [2]
					path = [2, 3]
					backtrack start = 3, path = [2, 3] return
					pop
				i = 3, path = [2] => end backtrack
			pop
		i = 2
			path = 3
			backtrack
				i = start = 3 => end
 */
public class TimTatCaCacToHopKoTrung {
	// Tìm tất cả các tổ hợp gồm 2 số từ [1, 2, 3]
	static List<Integer> nums = new ArrayList<>();

	static void backtracking(int start, List<Integer> path){
		if (path.size() == 2){
			System.out.println(path);
			return;
		}

		for (int i = start; i < nums.size(); i++){
			path.add(nums.get(i));
			backtracking(i+1, path);
			path.removeLast();
		}
	}

	public static void main(String[] args) {
		nums.add(1);
		nums.add(2);
		nums.add(3);
		backtracking(0, new ArrayList<>());
	}
}

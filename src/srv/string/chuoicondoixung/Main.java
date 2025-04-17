package srv.string.chuoicondoixung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("D:\\code\\DSA\\src\\srv\\string\\chuoicondoixung\\input.txt"));

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int tc = 0; tc < T; tc++){
			String line = sc.nextLine();
			int count = 0;
			for (int i = 0; i < line.length(); i++){
				for (int j = i; j < line.length(); j++){
					if (isDoiXung(line, i, j)){
						count++;
					}
				}
			}
			System.out.println("#" + (tc+1) + " " + count);
		}
	}
	static boolean isDoiXung(String s, int start, int end){
		while(start < end){
			if(s.charAt(start) != s.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}

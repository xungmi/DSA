package array;

public class _717OneAndTwoBitCharacter {
	public boolean isOneBitCharacter(int[] bits) {
		for (int i = 0; i < bits.length; ){
			if (i == bits.length -1){
				if (bits[i] == 0){
					return true;
				}
			}
			if (bits[i] == 0){
				i++;
			} else {
				i+= 2;
			}
		}
		return false;
	}
}

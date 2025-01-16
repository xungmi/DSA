package array;

public class _605CanPlaceFlower {
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;
		for (int i = 0; i < flowerbed.length; i++) {
			boolean left = true;
			boolean right = true;
			if (flowerbed[i] == 0) {
				if (i - 1 >= 0) {
					if (flowerbed[i - 1] == 1) {
						left = false;
					}
				}
				if (i + 1 < flowerbed.length) {
					if (flowerbed[i + 1] == 1) {
						right = false;
					}
				}
				if (left & right) {
					count++;
					flowerbed[i] = 1;
				}
			}
		}
		return count >= n;
	}

	public static void main(String[] args) {
		int[] flowerbed = new int[]{0,0,1,0,1};
		int n = 1;
		System.out.println(canPlaceFlowers(flowerbed, n));
	}
}

package sort.mergesort;

import java.util.Arrays;

public class Revise {
	static void mS(int[] arr, int left, int right){

		if (left  < right){
			int mid = left + (right - left)/2;

			mS(arr, left, mid);
			mS(arr, mid+1, right);

			m(arr, left, mid, right);
		}
	}

	static void m(int[] arr, int left, int mid, int right){
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];

		System.arraycopy(arr, left, leftArr, 0, n1);
		System.arraycopy(arr, mid + 1, rightArr, 0, n2);

		int i = 0, j = 0;
		int k = left;

		while (i < n1 && j < n2){
			if (leftArr[i] <= rightArr[j]){
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while (i < n1){
			arr[k++] = leftArr[i++];
		}
		while (j < n2) {
			arr[k++] = rightArr[j++];
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,5,2,6,3,8,2};
		mS(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}

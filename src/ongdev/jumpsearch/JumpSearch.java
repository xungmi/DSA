package ongdev.jumpsearch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class JumpSearch {
	//arr phai duoc sap xep tang dan
	public static int jumpSearch(int[] arr, int K){
		int d = 3;
		int i = 0;
		int j = i + d;

		while(j < arr.length && arr[j] < K){
			i = i + d;
			j = j + d;
		}

		if (j > arr.length) j = arr.length-1;
		while (arr[i] < K){
			i++;
			if (i >= arr.length || i > j){
				return -1;
			}
		}
		if (arr[i] == K){
			return i;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		int[] arr = new int[]{1, 2, 7, 9, 20, 25, 34, 45, 89, 105};
		System.out.println(jumpSearch(arr, 89));

	}
}

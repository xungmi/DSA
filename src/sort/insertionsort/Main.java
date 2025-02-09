package sort.insertionsort;

import java.util.Arrays;

/*
Duyệt qua từng phần tử, chèn nó vào vị trí đúng trong phần đã sắp xếp.
Tốt nhất: O(n) : Với mảng đã được sắp xếp sẵn, không có phần tử nào cần dịch chuyển.
Vòng lặp while không chạy, chỉ có vòng for chạy n-1 lần
    [1, 2, 3, 4, 5]
Xấu nhất: O(n2)
    [5, 4, 3, 2, 1]
 */
public class Main {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]){
                arr[j + 1] = arr[j];
                System.out.println(Arrays.toString(arr));
                j--;
            }
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 5, 2, 8};
        insertionSort(arr);
    }
}

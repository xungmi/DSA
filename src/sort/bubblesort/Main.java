package sort.bubblesort;

import java.util.Arrays;

public class Main {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { // Giới hạn đến n-1 vì phần tử cuối đã được sắp xếp
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 9, 1, 5, 6};
        bubbleSort(arr);
    }
    /*
    Bubble Sort là thuật toán sắp xếp dựa trên việc so sánh và hoán đổi các phần tử liên tiếp nếu chúng không theo đúng thứ tự.
    Tốt nhất: O(n) : mảng đã được sắp xếp
    Xấu nhất: O(n2) : mảng bị sắp xếp ngược : (n−1)+(n−2)+...+2+1
    Ưu: đơn giản, dễ cài đặt, hiệu quả khi mảng gần nhu đã sắp xễp
    Nhược: Hiệu suất kém trên tập dữ liệu lỡn
     */
}

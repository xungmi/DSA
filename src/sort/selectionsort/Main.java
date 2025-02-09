package sort.selectionsort;

import java.util.Arrays;

/*
Chọn phần tử nhỏ nhất trong danh sách chưa được sắp xếp và đưa nó về vị trí đúng.
Tiếp tục quá trình cho đến khi mảng được sắp xếp hoàn toàn.
 */
public class Main {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            int minIdx = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,7,8,1,2, 4};
        selectionSort(arr);
    }
    /*
    Nhược điểm:
        Không hiệu quả với danh sách lớn.
        Không tối ưu cho danh sách gần như đã sắp xếp.
    Ưu điểm:
        Ít hoán đổi hơn Bubble Sort.
        Dễ cài đặt.
    Tốt nhất: O(n2)
    Xấu nhất: O(n2)
     */
}

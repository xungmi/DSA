package sort.quicksort;

/*
Gồm 3 bước:
    1) Chọn 1 phần tử làm pivot : có thể chọn ptu dau tien, o giua, cuoi cung hoac ngau nhiên
    2) Partitioning: sắp xếp các phần tử sao cho
        - tất cả các phần tử nhỏ hơn pivot nằm bên trái
        - tất cả mem lớn hơn pivot nằm bên phải
    3) đệ quy: áp dụng quick sort lên hai mảng con (bên trái và bên phải pivot)

Quan trọng nhất là pivot quyết định độ phức tạp
Xấu nhất: khi chọn pivot được chọn luôn là phần tử nhỏ nhất hoặc lớn nhất (tức mảng đã được sắp xếp)=> phần chia ko cân bằng
            => số lần gọi đệ quy là On thay vì Ologn
            Tổng số phép so sánh: O(n) + O(n-1) + ... + O(1) = O(n2)
Tốt nhất: Onlogn. Mỗi lần chọn pivot thì chia mảng thành 2 phần n/2.
    O(n) + 2O(n/2) + 4O(n/4) + ... + O(1) ~ O(n) + O(n/2) + O(n/4) + ... + O(1) = O(n+n/2+n/4+...+1) = O(n(1-(1/2)^logn))/(1-1/2)

 */
public class Main {
//    public static void quickSort(int[] arr, int low, int high) {
//        if (low < high) {
//            int pivotInd = partition(arr, low, high);
//            quickSort(arr, low, pivotInd - 1);
//            quickSort(arr, pivotInd + 1, high);
//        }
//    }
//
//    private static int partition(int[] arr, int low, int high) {
//        int pivot = arr[high];
//        int i = low - 1;
//
//        for (int j = low; j < high; j++) {
//            if (arr[j] < pivot) {
//                 i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//
//        int temp = arr[i + 1];
//        arr[i + 1] = arr[high];
//        arr[high] = temp;
//
//        return i + 1;
//    }

    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Mảng sau khi sắp xếp: " + java.util.Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low -1;

        for (int j = low; j < high; j++){
            if (arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = pivot;
        arr[high] = temp;
        return i+1;
    }
}

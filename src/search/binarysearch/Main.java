package search.binarysearch;

public class Main {
    public static int binarySearch_Recursive(int[] arr, int left, int right, int k) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (k == arr[mid]) {
            return mid;
        } else if (k < arr[mid]) {
            return binarySearch_Recursive(arr, left, mid - 1, k);
        } else {
            return binarySearch_Recursive(arr, mid + 1, right, k);
        }
    }

    public static int binarySearch_While(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;

        while (left <= right){// dấu bằng để kiểm tra nếu target = phần tử cuối cùng của mảng/mảng có phần tử duy nhất
            int mid = left + (right-left)/2;

            if (arr[mid] == target) return mid;
            else if (target < arr[mid]){
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
//        System.out.println(binarySearch_Recursive(arr, 0, 6, 5));
        System.out.println(binarySearch_While(arr, -1));
    }
    /**
     * Phân tích:
     * Tốt nhất: O(1)
     * Xấu nhất: Ologn
     * Ưu điểm: tìm kiếm nhanh, số lần giảm theo cấp số nhân
     * Nhược: dữ liệu phải được sắp xếp trước
     * Cách triển khai:
     *  - đệ quy: tốn bộ nhớ hơn, có thể gây stack overflow nếu dữ liệu quá lớn, hữu ích khi làm việc với BST
     *  - vòng lặp: space O1, phù hợp với mảng và các tập dữ liệu lớn
     */
}

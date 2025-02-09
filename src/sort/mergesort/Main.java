package sort.mergesort;

import java.util.Arrays;

/*
Chia mảng thành các phần nhỏ hơn
Sắp xếp từng phần
Kết hợp các phần tử đã sắp xếp lại thành mảng hoàn chỉnh

Tốt nhất: Onlogn
Xấu nhất: Onlogn
Số lần chia đến khi còn 1 phần tử: log cơ số 2 của n => số mức là logn
tổng thời gian trộn: ở mỗi mức i, có 2^i mảng con, mỗi mảng có kích thước n/2^i => chi phí: 2^i x O(n/2^i) = O(n)
=> độ phức tạp: Ologn x O(n) = O(nlogn)

Ưu điểm
✔ Luôn đảm bảo O(n log n) trong mọi trường hợp.
✔ Ổn định (không làm thay đổi thứ tự của các phần tử có giá trị bằng nhau).
✔ Thích hợp cho danh sách liên kết (Linked List).

Nhược điểm
✘ Tốn bộ nhớ phụ O(n) do phải tạo mảng con.
✘ Không tối ưu với mảng nhỏ (Insertion Sort có thể hiệu quả hơn).

Khi nào nên sử dụng Merge Sort?
Khi cần một thuật toán ổn định và hiệu suất ổn định O(n log n).
Khi sắp xếp tập dữ liệu lớn mà Quick Sort có thể bị O(n²).
Khi làm việc với danh sách liên kết (do Merge Sort không yêu cầu truy cập ngẫu nhiên).
 */
public class Main {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;  // Tìm vị trí giữa

            // Gọi đệ quy để chia nhỏ mảng
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Gộp hai nửa lại
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Tạo hai mảng con
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Sao chép dữ liệu vào hai mảng con
        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        // Chỉ mục ban đầu của hai mảng con
        int i = 0, j = 0;
        int k = left;

        // Gộp hai mảng con lại
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Sao chép phần còn lại của mảng trái (nếu có)
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Sao chép phần còn lại của mảng phải (nếu có)
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

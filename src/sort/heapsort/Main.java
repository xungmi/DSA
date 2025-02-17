//package sort.heapsort;
//
//public class Main {
//    /*
//    - là thuật toán sắp xếp dựa trên cấu trúc dữ liệu heap
//    - Có độ phức tạp O(nlogn) trong mọi trường hợp
//    - ko yêu cầu bộ nhớ phụ ngoài mảng đầu vào
//
//    -Heap: là cấu trúc cây nhị phân, mà
//        - mọi nút cha luôn lớn hơn con của nó
//        - tất cả các mức của cây đều đầy đủ trừ mức cuối cùng
//    - Các loại heap:
//        - Max heap: cha >= con
//        - Min heap: cha <= con
//    - Ý tưởng thuật toán heap sort:
//        1) Xây dựng Max Heap: chuyển đổi mảng thành 1 cây nhị phân heap hợp lệ
//        2) Heapify & Sort:
//            - Đưa phần tử lớn nhất (gốc của Heap) về cuối mảng.
//            - Giảm kích thước Heap và tiếp tục quá trình Heapify để duy trì thuộc tính Heap.
//     */
//
//    public void heapSort(int[] arr){
//        int n = arr.length;
//
//        //B1. Xay dung MaxHeap ( heapify tu giua mang ve dau)
//        for (int  i = n/2-1; i >= 0; i--){
//            heapify(arr, n, i);
//        }
//
//        //B2. dua phan tu lon nhat ve cuoi va dieu chinh heap
//        for (int i = n-1; i > 0; i--){
//            // doi arr0 voi arri
//            swap(arr, i);
//
//            //giam kich thuoc heap va tiep tuc Heapify
//            heapify(arr, i, 0);
//        }
//    }
//
//    // Hàm Heapify một nút để duy trì thuộc tính của Max Heap
//    private void heapify(int[] arr, int n, int i) {
//        int largest = i; // Giả sử nút i là lớn nhất
//        int left = 2 * i + 1; // Con trái
//        int right = 2 * i + 2; // Con phải
//
//        // Nếu con trái lớn hơn nút cha
//        if (left < n && arr[left] > arr[largest]) {
//            largest = left;
//        }
//
//        // Nếu con phải lớn hơn nút cha
//        if (right < n && arr[right] > arr[largest]) {
//            largest = right;
//        }
//
//        // Nếu largest thay đổi, đổi chỗ và tiếp tục Heapify
//        if (largest != i) {
//            swap(arr, i, largest);
//            heapify(arr, n, largest);
//        }
//    }
//
//
//    private void swap(int[] arr, int n) {
//        int temp = arr[0];
//        arr[0] = arr[n];
//        arr[n] = temp;
//    }
//
//
//}

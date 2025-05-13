package sort.quicksort;

/*
Chọn 1 thằng làm chuẩn, chia đám còn lại thành nhóm nhỏ hơn và nhóm lớn hơn, rồi tiếp tục chia
Giống: Bạn chọn 1 người làm chuẩn,
       Ai thấp hơn đứng trái, ai cao hơn đứng phải
       Tiếp tục chọn trong từng nhóm cho đến khi tất cả đều xếp đúng

Gồm 3 bước:
    1) Chọn 1 phần tử làm pivot : có thể chọn ptu dau tien, o giua, cuoi cung hoac ngau nhiên
    2) Partitioning: sắp xếp các phần tử sao cho
        - tất cả các phần tử nhỏ hơn pivot nằm bên trái
        - tất cả mem lớn hơn pivot nằm bên phải
    3) đệ quy: áp dụng quick sort lên hai mảng con (bên trái và bên phải pivot)

 */
public class Main {
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

        //arr[high] dang chua pivot
        //i là chỉ số vị trí cuối cùng mà các phần tử <= pivot đã được xếp.
        
        int temp = arr[i+1];
        arr[i+1] = pivot;
        arr[high] = temp;
        return i+1;
    }
}

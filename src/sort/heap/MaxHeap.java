package sort.heap;

/*
	Max Heap:
		Là cây nhị phân hoàn chỉnh:
			Tất cả các mức (trừ mức cuối cùng) đều đầy đủ node
			Các node của mức cuối cùng nằm từ trái qua phải.
			Giá trị của node cha ≥ giá trị của 2 node con

	Cach trien khai:
		Dùng mảng : Phổ biến
		Dùng cấu trúc cây (node left/right) :It phổ biến

	Dung mảng:
		Cong thuc chi so trong mang voi phan tu tai vi tri i:
			Con trái: left(i) = 2*i + 1
			Con phải: right(i) = 2*i + 2
			Cha: parent(i) = (i-1)/2 (làm tròn xuống)

	Cac thao tac chinh:
			heapify(arr, n, i):
				Đảm bảo node i và các node con thỏa mãn max-heap.
				Nếu con nào lớn hơn cha thì swap và tiếp tục heapify xuống dưới.
			buildHeap(arr):
				Duyệt từ node cha cuối cùng (n/2 - 1) → node gốc (0), gọi heapify.
				=> biến toàn bộ mảng thành Max-Heap

			insert(value):
				Thêm phần tử vào cuối.
				"Bơi ngược" lên (bubble up) để duy trì heap.

			extractMax():
				Lấy phần tử lớn nhất (arr[0]).
				Đưa phần tử cuối lên arr[0], giảm kích thước heap.
				heapify từ gốc xuống.
 */
public class MaxHeap {
	private void heapify(int i) {
		
	}

}

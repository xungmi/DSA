package array.hashmap;

/*
Xây dựng 1 hashmap:
	- Mảng để lưu trữ các bucket
	- Hash function để ánh xạ key thành chỉ số trong mảng
	- collision handling: vì 2 key có thể tạo ra cùng 1 hash value => áp dụng chaining hoặc open addressing
		+ chaining: lưu trữ nhiều key-value trong 1 linkedlist tại mỗi bucket
		+ open addressing: lưu trữ trực tiếp dữ liệu trong mảng. sd các chiến lược như: linear probing,..
Khái niệm:
	- bucket: là 1 vùng trong bộ nhớ lưu trữ các phần tử cùng hash value, giải quyết trường hợp va chạm (collision) khi nhiều khóa khác nhau có giá trị băm trùng nhau
	- số bucket là số index của hash table.
	- Khi thêm 1 phần tử vào HashMap, hash function tính hash value dựa trên key => Ánh xạ hash value tới chỉ số của hash table => Phần tử được đặt vào bucket tương ứng với chỉ số của hash table.
	- Khi bucket trống, them phần tử vào bucket
	- Khi bucket đã chứa phần tử, hashmap sử dụng linked list, hoặc cây để quản lý.
	- Load factor biểu thị mức độ đầy của hashtable so với kích thước tối đa của nó.
	        Công thức: loadFactor = size/số bucket.
	        Khi load factor cao => collision tăng lên, làm giảm hiệu suất chèn vs tìm kiếm => resize khi load factor vượt ngưỡng.
	        Load factor từ 0.5 => 0.75 là ổn

	- Open addressing hiệu quả hơn ề bộ nhớ, dùng khi dữ liệu nhỏ // kích thước bảng băm lớn hơn nhiều số phần tử
	- Chaning dùng khi xóa phần tử thường xuyên, dữ liệu phân bố ko đều , số lượng phần tử lớn và ko xác định trước
 */
public class _706DesignHashMap {
    static class MyHashMap {

        private static class Node{
            int key, value;
            Node next;

            public Node(int key, int value){
                this.key = key;
                this.value = value;
            }
        }

        private Node[] buckets;
        private static final int SIZE = 1000;
        private int hash(int key){
            return key%SIZE;
        }

        public MyHashMap() {
            buckets = new Node[SIZE];
        }

        public void put(int key, int value) {
            int bucketIndex = hash(key);
            if (buckets[bucketIndex] == null){
                buckets[bucketIndex] = new Node(key, value);
            } else {
                Node currentNode = buckets[bucketIndex];
                while (true){
                    if (currentNode.key == key){
                        currentNode.value = value;
                        return;
                    }
                    if (currentNode.next == null) break;
                    currentNode = currentNode.next;
                }
                currentNode.next = new Node(key, value);
            }
        }

        public int get(int key) {
            int index = hash(key);
            Node currentNode = buckets[index];
            while (currentNode != null) {
                if (currentNode.key == key){
                    return currentNode.value;
                }
                currentNode = currentNode.next;
            }
            return -1;

        }

        public void remove(int key) {
            int index = hash(key);
            Node currentNode = buckets[index];
            Node prev = null;
            while (currentNode != null){
                if (currentNode.key == key){
                    if (prev == null){
                        buckets[index] = currentNode.next;
                    } else {
                        prev.next = currentNode.next;
                    }
                    return;
                }
                prev = currentNode;
                currentNode = currentNode.next;
            }
        }
    }

    public static void main(String[] args) {
        MyHashMap obj = new MyHashMap();

    }

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
}

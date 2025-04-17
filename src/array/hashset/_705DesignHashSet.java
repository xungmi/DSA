package array.hashset;

/*
Cac thành phần của HashSet:
    - bucket array ~ hash table
    - hash function
    - collision handling
 */
public class _705DesignHashSet {
    static class MyHashSet {
        private class Node {
            private int value;
            private Node next;

            public Node(int value) {
                this.value = value;
                this.next = null;
            }
        }

        private final Node[] buckets;
        private final int SIZE = 1000;

        public int hash(int key) {
            return key % SIZE;
        }

        public MyHashSet() {
            buckets = new Node[SIZE];
        }

        public void add(int key) {
            int index = hash(key);
            if (buckets[index] == null) {
                buckets[index] = new Node(key);
            } else {
                Node current = buckets[index];
                while (current != null) {
                    if (current.value == key) {
                        return;
                    }
                    if (current.next == null){
                        current.next = new Node(key);
                        return;
                    }
                    current = current.next;
                }
            }
        }

        public void remove(int key) {
            int index = hash(key);
            Node current = buckets[index];
            Node prev = null;
            while (current != null) {
                if (current.value == key) {
                    if (prev == null) {
                        buckets[index] = current.next;
                    } else {
                        prev.next = current.next;
                    }
                    return;
                }
                prev = current;
                current = current.next;
            }
        }

        public boolean contains(int key) {
            int index = hash(key);
            Node current = buckets[index];
            while (current != null) {
                if (current.value == key) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            boolean first = true;

            for (int i = 0; i < SIZE; i++) {
                Node current = buckets[i];

                while (current != null) {
                    if (!first) {
                        sb.append(", ");
                    }
                    sb.append(current.value);
                    first = false;
                    current = current.next;
                }
            }

            sb.append("]");
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(2);

        System.out.println(set);
    }
}

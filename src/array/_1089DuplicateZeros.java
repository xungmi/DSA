package array;

import java.util.ArrayList;

public class _1089DuplicateZeros {
    public static void main(String[] args) {
        duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }

    public static void duplicateZeros(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arrayList.size() < arr.length) {
                arrayList.add(arr[i]);
                if (arrayList.size() < arr.length) {
                    if (arr[i] == 0) {
                        arrayList.add(0);
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = arrayList.get(i);
        }
    }
}

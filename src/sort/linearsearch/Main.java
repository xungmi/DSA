package sort.linearsearch;

public class Main {
    public static int linearSearch(int[] arr, int k){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == k){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        System.out.println(linearSearch(arr, 6));
    }

    //phan tich
    /*
    tot nhat: O(1)
    xau nhat: On
    Uu: don gian, de cai dat, phu hop voi tap du lieu nho, ko can du lieu phai sap xep
    Nhuoc: cham voi tap du lieu lon vi phai kiem tra tung phan tu
     */

}

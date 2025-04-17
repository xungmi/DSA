//package array;
//
//import java.util.ArrayList;
//import java.util.Objects;
//
//public class _599 {
//    public String[] findRestaurant(String[] list1, String[] list2) {
//        ArrayList<String> arr = new ArrayList<>();
//        int minIdxSum = Integer.MAX_VALUE;
//        String temp = "";
//        for (int i = 0; i < list1.length; i++){
//            for (int j = 0; j < list2.length; j++){
//                if (Objects.equals(list1[i], list2[j])){
//                    if (i + j < minIdxSum){
//                        minIdxSum = i + j;
//                        temp = list1[i];
//                    } else if (i + j == minIdxSum){
//                        arr.add(list1)
//                    }
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//}

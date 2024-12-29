//package array;
//
////https://leetcode.com/problem-list/array/
//
//import java.util.Arrays;
//import java.util.HashMap;
//
//public class HelloWorld {
//    public static int buttonWithLongestTime(int[][] events) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int min_index_of_max_time = 100000;
//        int max_time = 0;
//        for (int i = 0; i < events.length; i++) {
//            int timePress = 0;
//            if (i == 0) {
//                map.put(events[i][0], events[i][1]);
//            } else {
//                map.putIfAbsent(events[i][0], 0);
//                timePress = events[i][1] - events[i-1][1];
//                if (map.get(events[i][0]) != 0){
//                    map.put(events[i][0], timePress + map.get(events[i][0]));
//                } else {
//                    map.put(events[i][0], timePress);
//                }
//            }
//
//            if (max_time < timePress + map.get(events[i][0])){
//                max_time = timePress + map.get(events[i][0]);
//                if (events[i][0] < min_index_of_max_time){
//                    min_index_of_max_time = events[i][0];
//                }
//            }
//        }
//        return min_index_of_max_time;
//    }
//
//    public static void main(String[] args) {
//        int[][] array = {
//                {5, 4},
//                {20, 14}
//        };
//
//        System.out.println(buttonWithLongestTime(array));
//
//    }
//}

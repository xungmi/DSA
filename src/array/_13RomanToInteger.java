package array;

import java.util.HashMap;

public class _13RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            if (i+1 < s.length()){
                String key = s.charAt(i) + String.valueOf(s.charAt(i+1));
                if (map.containsKey(key)){
                    sum += map.get(key);
                    i++;
                    continue;
                }
            }
            sum += map.get(s.charAt(i)+"");
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}

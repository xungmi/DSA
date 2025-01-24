package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class _9PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        while (x > 0){
            arr.add(x%10);
            x = x/10;
        }
        for (int i = 0; i < arr.size()/2; i++){
            if (!Objects.equals(arr.get(i), arr.get(arr.size() - 1 - i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1212));
    }
}

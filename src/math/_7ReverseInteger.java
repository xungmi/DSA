package math;

public class _7ReverseInteger {
    public static int reverse(int x) {
        int reverse = 0;
        int num = Math.abs(x);

        while (num > 0) {
            int lastDigit = num % 10;
            if (reverse > (Integer.MAX_VALUE-lastDigit)/10){
                return 0;
            }
            reverse = reverse*10 + lastDigit;
            num /= 10;
        }

        return x < 0 ? -reverse : reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}

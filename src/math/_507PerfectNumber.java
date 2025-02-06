package math;

public class _507PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        int increase = 1;
        while (increase <= num/2){
            if (num%increase==0){
                sum += increase;
            }
            increase++;
        }
        return sum == num;
    }
}

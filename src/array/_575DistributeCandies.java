package array;

import java.util.Arrays;

public class _575DistributeCandies {
    public static int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int numOfCandyCanEat = candyType.length/2;
        int i = 0;
        for (int j = 0; j < candyType.length; j++){
            if (candyType[j] != candyType[i]){
                candyType[i+1] = candyType[j];
                i++;
            }
        }
        return Math.min(i+1, numOfCandyCanEat);
    }

    public static void main(String[] args) {
        int[] candies = new int[]{1,1,1,1,2,2,2,3,3,3};
        System.out.println(distributeCandies(candies));
    }
}

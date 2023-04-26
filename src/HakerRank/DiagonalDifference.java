package HakerRank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        System.out.println(diagonalDifference(new ArrayList<>(List.of(new ArrayList<>(List.of(1,2,3)),new ArrayList<>(List.of(4,5,6)),new ArrayList<>(List.of(9,8,9))))));
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int res;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum1= sum1 + arr.get(i).get(i);
            System.out.println("Sum1 : " + sum1);
            sum2 = sum2 + arr.get(i).get(arr.get(i).size()-1-i);
            System.out.println("Sum2 : " + sum2);
            System.out.println("*".repeat(20));
        }
        res = Math.abs(sum1 - sum2);
        return res;
    }
}

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[] {2,3,5,1,3}, 3));
//        System.out.println(kidsWithCandies(new int[] {4,2,1,1,2}, 1));
//        System.out.println(kidsWithCandies(new int[] {12,1,12}, 10));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int[] temp = new int[candies.length];
        for(int i = 0; i < candies.length; i++){
            boolean res = true;
            temp[i] = candies[i] + extraCandies;
            for (int j = 0; j < temp.length; j++) {
                if (temp[i] < candies[j]) {
                    res = false;
                    break;
                }
            }
            result.add(res);
        }
        return result;
    }
}

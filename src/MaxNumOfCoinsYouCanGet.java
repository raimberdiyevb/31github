import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumOfCoinsYouCanGet {
    public static void main(String[] args) {

    }
    public static int maxCoins(int[] piles) {
        ArrayList<Integer> arr = new ArrayList<>();
        int res = 0;
        Arrays.sort(piles);
        for(int n : piles){
            arr.add(n);
        }
        while(arr.size()>0){
            arr.remove(arr.size()-1);
            res+=arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            arr.remove(arr.get(0));
        }
        return res;
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArithmeticSubarrays {
    public static void main(String[] args) {

    }
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        for(int i = 0; i < l.length; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = l[i]; j <= r[i]; j++){
                list.add(nums[j]);
            }
            res.add(isArithmetic(list));
        }
        return res;
    }
    public static boolean isArithmetic(List<Integer> unsorted) {
        Collections.sort(unsorted);
        for(int i = 0; i < unsorted.size() - 1; i++){
            if(unsorted.get(i + 1) - unsorted.get(i) != unsorted.get(1) - unsorted.get(0)){
                return false;
            }
        }
        return true;
    }
}

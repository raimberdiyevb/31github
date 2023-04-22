import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {

    }
    public static int missingNumber(int[] nums){
        int res = 0;
        int n = nums.length;
        int neededLength = n+1;
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < neededLength; i ++){
            arr.add(i);
        }
        for(int i = 0; i < n; i++){
            if(nums[i] != arr.get(i)){
                res = i;
            }else{
                res = arr.get(neededLength);
            }
        }
        return res;
    }
}

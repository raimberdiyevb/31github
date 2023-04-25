package HakerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LonelyInteger {
    public static void main(String[] args) {
        System.out.println(lonelyInteger(new ArrayList<>(List.of(1,2,3,4,3,2,1))));
        System.out.println(lonelyInteger(new ArrayList<>(List.of(1,1,2,2,3))));
    }
    public static int lonelyInteger(List<Integer> a){
        int result = 0;
        int[] nums = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            nums[i] = a.get(i);
        }
        Arrays.sort(nums);
        if(nums.length == 1)
            result = nums[0];
        else if (nums[nums.length-1] != nums[nums.length-2]){
            result = nums[nums.length-1];
        }
        else{
            int i = 0;
            boolean foundRes = false;
            while(!foundRes){
                if(nums[i] != nums[i+1]){
                    result = nums[i];
                    foundRes = true;
                }
                i += 2;
            }
        }
        return result;
    }
}

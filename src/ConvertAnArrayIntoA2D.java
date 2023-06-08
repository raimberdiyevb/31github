import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConvertAnArrayIntoA2D {
    public static void main(String[] args) {
        System.out.println(findMatrix(new int[]{1,3,4,1,2,3,1}));
    }
    public static List<List<Integer>> findMatrix(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> map = getMap(nums);


        return res;
    }
    public static HashMap<Integer,Integer> getMap(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            boolean needBreak = false;
            if (!map.containsKey(nums[i])) {
                for (int j = i; j < nums.length - 1 && !needBreak; j++) {
                    if (nums[j] == nums[j + 1]) {
                        count++;
                    } else {
                        count++;
                        needBreak = true;
                    }
                }
                map.put(nums[i], count);
            }
        }
        map.put((Integer) map.keySet().toArray()[map.size() - 1], map.get((Integer) map.keySet().toArray()[map.size() - 1])+1);
        return map;
    }
}

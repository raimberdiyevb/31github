import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TopKFrequentElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[] {1,1,1,2,2,3}, 2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int count = 1;
            if(!map.containsKey(nums[i])){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[i] == nums[j]){
                        count++;
                        map.put(nums[i],count);
                    }
                }
                if(i == nums.length-1){
                    map.put(nums[i], 1);
                }
            }
        }
        System.out.println("Map : " + map);
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        ArrayList<Integer> values = new ArrayList<>(map.values());

        bubbleSort(values,keys);

        int[] res = new int[k];

        for(int i = 0; i < k; i ++){
            res[i] = keys.get(keys.size()-1-i);
        }




        return res;
    }
    public static void bubbleSort(ArrayList<Integer> arrVal, ArrayList<Integer> arrKey) {
        int n = arrVal.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arrVal.get(j) > arrVal.get(j + 1)) {
                    int temp = arrVal.get(j);
                    int temp2 = arrKey.get(j);
                    arrVal.set(j ,arrVal.get(j + 1));
                    arrKey.set(j, arrKey.get(j + 1) );
                    arrVal.set(j + 1, temp);
                    arrKey.set(j + 1, temp2);
                }
            }
        }
    }
}

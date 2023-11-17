import java.util.*;

public class SortArrayByNumberOf1byte {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})));
    }
    public static int[] sort(int[] arr){
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int[] ones = new int[arr.length];
        for (int i : arr){
            int count = Integer.bitCount(i);
            map.putIfAbsent(count, new ArrayList<>());
            map.get(count).add(i);
        }
        List<Integer> res = new ArrayList<>();
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for(int i : keys){
            List<Integer> values = map.get(i);
            res.addAll(values);
        }
        int k = 0;
        for (int i : res) {
            ones[k] = i;
            k++;
        }
        return ones;
    }
}

package HakerRank;

import java.util.ArrayList;
import java.util.List;

public class CountingSort1 {
    public static void main(String[] args) {
        System.out.println(countingSort(new ArrayList<>(List.of(1,1,3,2,1))));
    }
    public static List<Integer> countingSort(List<Integer> arr) {
        int[] count = new int[100];
        for (int i : arr) {
            count[i]++;
        }
        List<Integer> result = new ArrayList<>();
        for (int i : count) {
            result.add(i);
        }
        return result;
    }

}

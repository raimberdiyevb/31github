package HakerRank;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static void main(String[] args) {
        System.out.println(breakingRecords(new ArrayList<>(List.of(12,24,10,24))));
    }
    public static List<Integer> breakingRecords(List<Integer> scores){
        int min = scores.get(0);
        int max = scores.get(0);
        int countMin = 0;
        int countMax = 0;
        List<Integer> res = new ArrayList<>(2);

        for (Integer score : scores) {
            if (score > max) {
                countMax++;
                max = score;
            } else if (score < min) {
                countMin++;
                min = score;
            }
        }
        res.add(countMax);
        res.add(countMin);
        return res;
    }
}

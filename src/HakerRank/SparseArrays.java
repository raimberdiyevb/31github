package HakerRank;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static void main(String[] args) {

    }
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        ArrayList<Integer> res = new ArrayList<>();
        for(String query : queries){
            int count = 0;
            for(String input : strings){
                if( query.equals(input))
                    count++;
            }
            res.add(count);
        }
        return res;
    }
}

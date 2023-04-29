package HakerRank;

import java.util.ArrayList;

public class Pangrams {
    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
    }
    public static String pangrams(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            arr.add(c);
        }
        for (int i = 0; i < s.length(); i ++){
            char current = s.charAt(i);
            for (int j = 0; j < arr.size(); j++) {
                if(Character.toLowerCase(current) == arr.get(j)){
                    arr.remove(j);
                }
            }
        }
        if(arr.isEmpty()){
            return "pangram";
        }
        return "not pangram";
    }
}

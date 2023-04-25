import java.util.*;

public class SortingSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));
    }
    public static String sortSentence(String s) {
        String res = "";
        ArrayList<String> arr = new ArrayList<>(List.of(s.split(" ")));
        HashMap<Integer,String> hashMap = new HashMap<>();
        for(int i = 0; i < arr.size(); i ++){
            hashMap.put(Integer.parseInt(String.valueOf(arr.get(i).charAt(arr.get(i).length()-1))), arr.get(i).substring(0,arr.get(i).length()-1));
        }
        for(int i = 0; i < arr.size(); i ++){
            arr.set(i,hashMap.get(i+1));
            res = res + (arr.get(i) + " ");
        }
        return res.trim();
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        int count = 1;
        int[] arr = new int[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if(arr[i] == 0) {
                arr[i] = count;

                for (int j = i + 1; j < strs.length; j++) {
                    String checking = strs[i];
                    String current = strs[j];
                    if (isAnagram(checking, current)) {
                        arr[j] = count;
                    }
                    System.out.println("Array: ");
                    System.out.println(Arrays.toString(arr));
                    System.out.println("Current i : " + i );
                    System.out.println("Current j : " + j );
                }
                count++;
            }
            System.out.println("*".repeat(30));
            System.out.println("Current i : " + i);

        }
        System.out.println("Array Final: ");
        System.out.println(Arrays.toString(arr));


        int numberOfLists = 0;
        for( int num : arr){
            if(num > numberOfLists){
                numberOfLists = num;
            }
        }
        for (int i = 0; i < numberOfLists; i++) {
            res.add(new ArrayList<>());
        }

        for (int i = 0; i < arr.length; i++) {
            res.get(arr[i]-1).add(strs[i]);
        }

        return res;
    }
    public static boolean isAnagram(String s, String t) {
        ArrayList<Character> sArr = new ArrayList<>();
        boolean res = true;
        if(s.length() != t.length())
            return false;
        for(char c : s.toCharArray()){
            sArr.add(c);
        }
        for(char c : t.toCharArray()){
            if(!sArr.contains(c)){
                res = false;
            }else{
                sArr.remove(sArr.indexOf(c));
            }
        }
        return res;
    }
}

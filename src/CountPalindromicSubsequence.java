import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CountPalindromicSubsequence {
    public static void main(String[] args) {
        System.out.println(countPalindromicSubsequence("aabca"));
        System.out.println(countPalindromicSubsequence("adc"));
        System.out.println(countPalindromicSubsequence("bbcbaba"));
    }
    public static int countPalindromicSubsequence(String s) {
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        for(int i = 0; i < s.length()-2; i++){
            char start = s.charAt(i);
            if(!set.contains(start)){
                int lastIndex = s.lastIndexOf(start);
                List<Character> list = new ArrayList<>();
                if(lastIndex - i > 1){
                    for(int j = i+1; j < lastIndex; j++){
                        if(!list.contains(s.charAt(j))){
                            list.add(s.charAt(j));
                        }
                    }
                }
                res += list.size();
                set.add(start);
            }
        }
        return res;
    }
}

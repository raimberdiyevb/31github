import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIfaWordOccursAsaPrefixofAnyWordInaSentence {
    public static void main(String[] args) {
//        System.out.println(isPrefixOfWord("i love eating burger","burg"));
        System.out.println(isPrefixOfWord("this problem is an easy problem","pro"));
    }
    public static int isPrefixOfWord(String sentence, String searchWord) {
        List<String> arr = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        System.out.println(arr);
        int res = -1;
        for( String word : arr){
            if(word.startsWith(searchWord)){
                res = arr.indexOf(word) + 1;
                break;
            }
        }
        return res;
    }
}

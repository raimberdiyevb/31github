import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {
        System.out.println(mostCommonWord("a, a, a, a, b,b,b,c, c",
                new String[]{"a"}));
    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        String res = "";
        ArrayList<String> words = new ArrayList<>(Arrays.asList(paragraph.split(" ")));
        System.out.println(words);
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            String temp = "";
            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    temp = temp.concat(String.valueOf(Character.toLowerCase(c)));
                }
            }
            words.set(i, temp);
        }
        System.out.println(words);
        HashMap<String, Integer> map = new HashMap<>();
        for(String word: words){
            if(!Arrays.asList(banned).contains(word)) {
                map.put(word, Collections.frequency(words, word));
            }
        }
        res = getKeyFromValue(map, Collections.max(map.values()));
        return res;
    }
    public static String getKeyFromValue(HashMap<String, Integer> map, int v) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == v) {
                return entry.getKey();
            }
        }
        return null;  // Return null if the value is not found
    }

}

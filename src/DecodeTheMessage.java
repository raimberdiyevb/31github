import java.util.*;

public class DecodeTheMessage {
    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }
    public static String decodeMessage(String key, String message) {
        /*
            key = first appearance in key
            value = related letter from alphabet
         */
        Map<Character,Character> decipher = new LinkedHashMap<>();

        // get first appearances
        ArrayList<Character> arrayListOfKey = new ArrayList<>();
            // remove spaces from key
            for (int i = 0; i < key.length(); i++) {
                if(key.charAt(i) != ' ' && !arrayListOfKey.contains(key.charAt(i))) {
                    arrayListOfKey.add(key.charAt(i));
                }
            }

        // set keys and values
        ArrayList<Character> alphabet = new ArrayList<>(List.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
//        for(int i = 0; i < 26; i ++){
//            decipher.put(arrayListOfKey.get(i),alphabet[i]);
//        }
        System.out.println(arrayListOfKey);
        System.out.println(alphabet);

        for (int i = 0; i < arrayListOfKey.size(); i++) {
            decipher.put(arrayListOfKey.get(i), alphabet.get(i));
        }

        System.out.println(decipher);
        // loops through message and decoding it
        String res = "";
        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == ' '){
                res = res.concat(" ");
            }else{
                res = res.concat(String.valueOf(decipher.get(message.charAt(i))));
            }
        }



        return res;
    }
}

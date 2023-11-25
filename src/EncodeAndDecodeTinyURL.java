import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class EncodeAndDecodeTinyURL {
    public static void main(String[] args) {
        Codec codec = new Codec();
        System.out.println(codec.encode("https://leetcode.com/problems/design-tinyurl"));
//        System.out.println(codec.encode("https://justst.com/naruto/shippuden"));
//        System.out.println(codec.decode(codec.encode("https://jutsu.com/naruto/shippuden")));
    }
}
class Codec {
    private HashMap<String,String> map = new HashMap<>();
    private HashSet<String> set = new HashSet<>();

    public String getMap() {
        return map.toString();
    }
    public String getSet() {
        return set.toString();
    }

    // Encodes a URL to a shortened URL.
    public String getRandom(){
        Random random = new Random();
        StringBuilder res = new StringBuilder();
        String alphabet = "1234567890qwertyuiopasdfghjklzxcvbnm!@#$^&";
        for (int i = 0; i < 8; i++) {
            res.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        return res.toString();
    }
    public String encode(String longUrl) {

        if(map.containsKey(longUrl)){
            return map.get(longUrl);
        }
        String random = getRandom();
        while(set.contains(random)){
            random = getRandom();
        }
        set.add(random);
        String result = "http://tinyurl.com/" + random;
        map.put(longUrl,result);
        map.put(result,longUrl);
        return result;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        if(map.containsValue(shortUrl)){
            return map.get(shortUrl);
        }
        return "";
    }
}

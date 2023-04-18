import java.util.ArrayList;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("a", "ab"));
    }
    public static boolean isAnagram(String s, String t) {
        ArrayList<Character> sArr = new ArrayList<>();
        ArrayList<Character> tArr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            sArr.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            tArr.add(t.charAt(i));
        }
        for(int i = 0 ; i < sArr.size(); i++){
            boolean needBreak = false;
            for(int j = 0; j < tArr.size() && !needBreak; j++){
                if(sArr.get(i) == tArr.get(j)){
                    System.out.println("T : " + tArr.get(j) + " is being removed");
                    tArr.remove(j);
                    needBreak = true;
                }
                System.out.println("S : " + sArr.get(i));
                for ( char c : tArr){
                    System.out.print(" " + c + " ");
                }
                System.out.println("=".repeat(30));
            }
        }
        return tArr.isEmpty();
    }
}

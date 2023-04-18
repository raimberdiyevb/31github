import java.util.ArrayList;

public class RansomNote {
    public static void main(String[] args) {
//        System.out.println(canConstruct("a", "b"));
//        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean res = false;
        ArrayList<Character> ransom = new ArrayList<>();
        for (int i = 0; i < ransomNote.length() ; i++) {
            ransom.add(ransomNote.charAt(i));
        }
        ArrayList<Character> arrMagaz = new ArrayList<>();
        for (int i = 0; i < magazine.length() ; i++) {
            arrMagaz.add(magazine.charAt(i));
        }

        int i = 0;
        while(!ransom.isEmpty() && i < ransom.size()){
            int j = 0;
            boolean breakSecond = false;
            while(!arrMagaz.isEmpty() && j < arrMagaz.size() && !breakSecond) {
                if(ransom.get(i) == arrMagaz.get(j)){
                    ransom.remove(i);
                    arrMagaz.remove(j);
                    System.out.println("Ransom at " + i + " was removed");
                    System.out.println("Magaz at " + j + " was removed");
                    breakSecond = true;
                }
                System.out.println("Ransom at " + i + " is " + ransom.get(i));
                System.out.println("Magaz at " + j + " is " + arrMagaz.get(j));
                System.out.println(ransom);
                System.out.println(arrMagaz);
                System.out.println("=".repeat(30));
                j++;
            }
            i++;
        }
        if(ransom.isEmpty()){
            res = true;
        }
        return res;
    }
}

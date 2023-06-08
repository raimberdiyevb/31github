public class CheckIfOneStringSwapCanMakeStringsEqual {
    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank","kanb"));
        System.out.println(areAlmostEqual("attack","defend"));
        System.out.println(areAlmostEqual("bank","bank"));
        System.out.println(areAlmostEqual("bankb","kanbb"));
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        boolean res = false;
        for(int i = 0; i < s2.length(); i ++){
            for(int j = i + 1; j < s2.length(); j ++){
                char current = s2.charAt(i);
                char next = s2.charAt(j);
                if (s2.replaceFirst(Character.toString(current), Character.toString(next)).equals(s1)) {
                    res = true;
                    break;
                }
            }
        }
         return res;
    }
}

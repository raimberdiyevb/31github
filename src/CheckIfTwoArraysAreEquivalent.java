public class CheckIfTwoArraysAreEquivalent {
    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[] {"ab", "c"},new String[] {"a", "bc"}));
        System.out.println(arrayStringsAreEqual(new String[] {"a", "cb"},new String[] {"ab", "c"}));
        System.out.println(arrayStringsAreEqual(new String[] {"abc","d", "defg"},new String[] {"abcddefg"}));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = "";
        String w2 = "";
        for(int i = 0; i < word1.length; i++){
            w1 = w1.concat(word1[i]);
        }
        for(int i = 0; i < word2.length; i++){
            w2 = w2.concat(word2[i]);
        }
        System.out.println(w1 + "\n" + w2);
        System.out.println("=".repeat(30));
        return w1.equals(w2);
    }
}

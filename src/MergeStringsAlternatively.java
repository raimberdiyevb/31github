public class MergeStringsAlternatively {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("ABC", "pqr"));
        System.out.println(mergeAlternately("AB","pqrs"));
        System.out.println(mergeAlternately("ABCD","pq"));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Math.max(word1.length(),word2.length()); i++) {
            try {
                if (Character.isLetter(word1.charAt(i))) {
                    result.append(word1.charAt(i));
                }
            }catch (Exception ignored){
            }
            try {
                if (Character.isLetter(word2.charAt(i))) {
                    result.append(word2.charAt(i));
                }
            }catch (Exception ignored){
            }

        }
        return result.toString();
    }
}

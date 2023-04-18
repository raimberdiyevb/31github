public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World "));
    }
    public static int lengthOfLastWord(String s) {
        String word = (s.trim()).substring((s.trim()).lastIndexOf(" ") + 1);
        return word.length();
    }
}

public class FirstUniqueCharInAString {
    public static void main(String[] args) {
//        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("aaBaaBc"));
//        System.out.println(firstUniqChar("loveleetcode"));
    }
    public static int firstUniqChar(String s) {
        for(char c : s.toCharArray()){
            int index = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c);
            if(index == lastIndex)
                return index;
        }
        return -1;
    }
}

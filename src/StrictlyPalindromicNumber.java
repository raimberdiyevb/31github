public class StrictlyPalindromicNumber {
    public static void main(String[] args) {
        System.out.println(isStrictlyPalindromic(9));
        System.out.println(isStrictlyPalindromic(4));
        System.out.println(isStrictlyPalindromic(10));
    }
    public static boolean isStrictlyPalindromic(int n) {
        boolean res = true;
        for(int i = 2; i <= n-2; i++ ){
            char[] temp = (Integer.toString(n,i)).toCharArray();
            char[] reverse = new char[temp.length];
            if(!res){
                break;
            }
            for(int j = 0; j < temp.length / 2; j++){
                char tempo = reverse[j];
                reverse[j] = temp[temp.length - 1 - j];
                reverse[temp.length-1 - j] = tempo;
            }
            if(temp != reverse){
                res = false;
            }
        }
        return res;
    }
}

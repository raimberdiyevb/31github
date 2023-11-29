public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight2(00000000000000000000000000001011));
    }
    public static int hammingWeight(int n) {
            int count = 0;
            while (n != 0) {
                count += n & 1;
                n = n >>> 1;
            }
            return count;
    }
    public static int hammingWeight2(int n) {
        int res = 0;
        for( char c : Integer.toBinaryString(n).toCharArray()){
            if(c=='1')
                res++;
        }
        return res;
    }
}

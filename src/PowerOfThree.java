public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
    public static boolean isPowerOfThree(int n) {
        while(n > 1){
            n /= 3;
        }
        return n==1;
    }
}

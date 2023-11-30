public class MinOneBitOperations {
    public static void main(String[] args) {
        System.out.println(minimumOneBitOperations(3));
    }
    public static int minimumOneBitOperations(int n) {
        int x = 1;
        int res = 0;
        while(n > 0){
            res += n ^ (n-1) * x;
            x = -1 * x;
            n &= n-1;
        }
        return Math.abs(res);
    }
}

public class UglyNumber {
    public static void main(String[] args) {

        System.out.println(isUgly(2147483648L));

    }
    public static boolean isUgly(long n){
        if (n < 0) return false;
        long current = n;
        for( int i = 1; i <= n / 2; i++){
            if (current == 1) return true;
            if(current % 2 == 0) current /= 2;
            else if(current % 3 == 0) current /= 3;
            else if (current % 5 == 0) current /= 5;
            else return false;
        }
        return true;
    }
}

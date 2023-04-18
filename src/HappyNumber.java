public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy( int n){
        boolean res = false;
        while(n != 1){
            int digit = 0;
            int num = n;
            int sum = 0;
            while(num > 0){
                digit = num % 10;
                num /= 10;
                sum = sum + (int) Math.pow(digit,2);
            }
            n = sum;
        }
        System.out.println(n);
        if(n == 1){
            res = true;
        }
        return res;
    }
}

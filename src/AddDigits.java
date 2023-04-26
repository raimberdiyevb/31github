public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
    public static int addDigits(int num) {
        int tempRes = 0;
        while(num > 10) {
            while (num != 0) {
                int digit = num % 10;
                num /= 10;
                tempRes += digit;
            }
            num = tempRes;
            tempRes = 0;
        }
        return num;
    }
}

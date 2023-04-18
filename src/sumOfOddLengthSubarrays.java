public class sumOfOddLengthSubarrays {
    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[] {1,4,2,5,3}));
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for(int i = 0 ; i < n; i++){
            int end = i + 1;
            int start = n - i;
            int total = start * end;
            int odd = total / 2;
            if(odd % 2 == 1)
                odd++;
            sum += odd * arr[i];
        }
        return sum;
    }
}

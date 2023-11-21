import java.util.Arrays;

public class CountNicePairsInAnArray {
    public static void main(String[] args) {
        System.out.println(countNicePairs(new int[]{42,11,1,97,120}));
        System.out.println(countNicePairs(new int[]{13,10,35,24,76}));
    }
    public static int countNicePairs(int[] nums) {
        int len = nums.length;
        int mod = 1000000007;
        long res = 0;
        for(int i = 0; i < len; i++)
            nums[i] = nums[i] - rev(nums[i]);
        Arrays.sort(nums);
        for(int i = 0; i < len-1; i++) {
            long cont = 1;
            while(i < len-1 && nums[i] == nums[i+1]) {
                cont++;
                i++;
            }
            res = (res%mod + (cont*(cont-1))/2)%mod;
        }
        return (int) res % mod;
    }
    public static int rev(int n){
        int res = 0;
        while(n > 0){
            res = (res * 10) + (n % 10);
            n /= 10;
        }
        return res;
    }
}

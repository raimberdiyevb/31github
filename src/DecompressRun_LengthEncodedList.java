import java.util.Arrays;

public class DecompressRun_LengthEncodedList {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decompressRLElist(new int[]{1, 2, 3, 4})));
    }
    public static int[] decompressRLElist(int[] nums) {
        int freq = 0;
        int val = 1;
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length/2; i ++){
            res[freq] = nums[freq];
        }
        return nums;
    }
}

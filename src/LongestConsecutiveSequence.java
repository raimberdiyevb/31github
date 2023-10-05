import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int res = Integer.MIN_VALUE;
        int j = 1;
        boolean firstTime = true;
        String s = "";
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] + 1 == nums[i+1]){
                if(firstTime) {
                    s = s + nums[i] + nums[i+1];
                    firstTime = false;
                }else {
                    s = s + nums[i + 1];
                }

                if(s.length() > res){
                    res = s.length();
                }
            }else{
                s = "";
            }
        }


        return res;
    }
}

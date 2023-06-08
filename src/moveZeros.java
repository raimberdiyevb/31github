import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,5});
    }
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            boolean moveOn = false;
            if (current == 0) {
                for (int j = i + 1; j < nums.length && !moveOn; j++) {

                    int next = nums[j];
                    if (next != 0) {
                        nums[i] = next;
                        nums[j] = current;
                        moveOn = true;
                    }
                }

                System.out.println(Arrays.toString(nums));
            }
        }
    }
}

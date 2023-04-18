import java.util.ArrayList;

public class DifferenceBetweenElementSumAndDigitSum {
    public static void main(String[] args) {
        System.out.println(getArrayInCorrectForm(new int[]{1, 15, 6, 3, 25, 11, 100, 101}));
        System.out.println(differenceOfSum(new int[]{1, 2, 3, 4}));
    }
    public static int differenceOfSum(int[] nums){
        int sumOfElements = 0;
        int sumOfDigits = 0;
        for(int num : nums){
            sumOfElements+=num;
        }
        for(int num : getArrayInCorrectForm(nums)){
            sumOfDigits+= num;
        }
        return Math.abs(sumOfElements - sumOfDigits);
    }
    public static ArrayList<Integer> getArrayInCorrectForm(int[] nums){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 10){
                res.add(nums[i]);
            }else{

                while(nums[i] > 0) {
                    res.add(nums[i] % 10);
                    nums[i] /= 10;
                }
            }
        }
        return res;
    }
}

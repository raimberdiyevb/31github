import java.util.Arrays;

public class LeftAndRight {
        public static void main(String[] args) {
            var list = leftRigthDifference(new int[]{10,4,8,3});
            System.out.println(Arrays.toString(list));
        }
        public static int[] leftRigthDifference(int[] nums) {
            int[] answer = new int[nums.length];
            int[] leftSum = new int[nums.length];
            int[] rightSum = new int[nums.length];
            for(int i = 0; i < nums.length; i++){
                if(i == 0){
                    leftSum[i] = 0;
                    System.out.println("0 was added");
                }else{

                    int sumLeft=0;
                    for(int j = i-1;j >= 0; j --){
                        sumLeft += nums[j];
                        System.out.println("Number was added");
                        leftSum[i] = sumLeft;
                    }
                }
                if(i == nums.length-1){
                    rightSum[i]=0;
                    System.out.println(" right Number was added");

                }else{
                    int sumRight=0;
                    for(int k = i+1;k < nums.length; k ++){
                        sumRight += nums[k];
                        System.out.println(" right Number was added");
                        rightSum[i] = sumRight;
                    }
                }
                answer[i] = Math.abs((leftSum[i] - rightSum[i]));
            }
            return answer;
        }
}

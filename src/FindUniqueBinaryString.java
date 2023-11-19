public class FindUniqueBinaryString {
    public static void main(String[] args) {
        System.out.println(findDifferentBinaryString(new String[]{"111","011","001"}));
    }
    public static String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            if(nums[i].charAt(i)=='0') sb.append('1');
            else sb.append('0');
        }
        return sb.toString();
    }
}

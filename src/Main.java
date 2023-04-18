public class Main {
    public static void main(String[] args) {
    }
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i ++)
        {
            nums[i]  += nums[i-1];
        }
        return nums;
    }
    public static int mostWordsFound(String[] sentences) {
        int res = 0;
        int words = 1;
        for(int i = 0; i < sentences.length; i++)
        {
            for(int j = 0; j < sentences[i].length(); j++)
            {
                char currentChar;
                currentChar = sentences[i].charAt(j);
                if(currentChar == ' ')
                {
                    words ++;
                }
                if(res == 0)
                {
                    res = words;
                }
            }
            if(words > res)
            {
                res = words;
            }
            words = 1;
        }
        return res;
    }

}
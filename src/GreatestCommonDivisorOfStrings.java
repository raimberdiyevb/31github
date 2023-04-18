public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABABABAB", "ABAB"));
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(gcdOfStrings("ABABABAB", "ABAB"));
        System.out.println(gcdOfStrings("LEET", "CODE"));


    }
    public static String finalize( String str1, String str2, int number1, int number2)
    {
        String res = "";
        if(number1 % number2 == 0)
        {
            res = getT(str1).repeat(number2) ;
        }else
        {
            res = getT(str1);
        }

        return res;
    }
    public static String gcdOfStrings(String str1, String str2)
    {
        String res = "";
        String t = getT(str1);
        int number1 =  getNumberOfUsesOfStr(str1);
        int number2 = getNumberOfUsesOfStr(str2);
        int tt;
        if(number1 < number2)
        {
            tt = number1;
            number1 = number2;
            number2 = tt;
        }

        if(getT(str1).equals(getT(str2)))
        {
            res = finalize(str1, str2, number1, number2);
        }
        if(!str1.equals(getT(str1).repeat(number1)) || !str2.equals(getT(str2).repeat(number2)))
        {
            res = "";
        }
        return res;
    }

        public static int getNumberOfUsesOfStr( String str)
    {
        int res;
        int lengthOfStr1 = str.length();
        int lengthOfT = getT(str).length();
        res = lengthOfStr1 / lengthOfT;
        return res;
    }

    public static String getT(String str1)
    {
        char initialChar = str1.charAt(0);
        String res = Character.toString(initialChar);
        String currentStrChar;
        char currentChar;
        for(int i = 1; i < str1.length(); i++)
        {
            currentChar = str1.charAt(i);

            if(currentChar == initialChar)
            {
                break;
            }
            currentStrChar = Character.toString(currentChar);
            res += currentStrChar;
        }
        if(res.equals(str1))
            res = str1;
        return res;
    }
}

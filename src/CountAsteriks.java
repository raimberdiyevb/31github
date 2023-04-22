public class CountAsteriks {
    public static void main(String[] args) {
        System.out.println(countAsterisks("l|*e*et|c**o|*de|"));
        System.out.println(countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
        System.out.println(countAsterisks("yodsahjdjfjklds"));
    }
    public static int countAsterisks(String s) {
        int res = 0;

        // prepare string to count
        String preparedStr = "";
        int i = 0;
        boolean needBreak = false;
        boolean needWrite = true;
        while(!needBreak){
            if(needWrite) {
                if (s.charAt(i) != '|') {
                    preparedStr = preparedStr.concat(Character.toString(s.charAt(i)));
                } else if (s.charAt(i) == '|') {

                }
            }


        }

        //count


        return res;
    }
}

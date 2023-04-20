public class PercentageOfaLetterInString {
    public static void main(String[] args) {
        System.out.println(percentageLetter("foobar", 'o'));
        System.out.println(percentageLetter("faatbar", 'o'));
    }
    public static int percentageLetter(String s, char letter) {
        double result = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == letter){
                result++;
            }
        }

        result = (result / s.length()) * 100;


        return (int) (result + 0.50);
    }
}


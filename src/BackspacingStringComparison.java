public class BackspacingStringComparison {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab##","c#d#"));
    }
    public static boolean backspaceCompare(String s, String t) {
        if(s.equals(t)) return true;
        s = handle(s);
        t = handle(t);
        System.out.println(s);
        System.out.println(t);
        return s.equals(t);
    }
    public static String handle(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c == '#' ){
                if(!stringBuilder.toString().equals(""))
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
            }else{
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}

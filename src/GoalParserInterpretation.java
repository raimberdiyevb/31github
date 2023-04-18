public class GoalParserInterpretation {
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
        System.out.println(interpret("G()()()()(al)"));
        System.out.println(interpret("(al)G(al)()()G"));
    }
    public static String interpret(String command) {
        String res = "";
        for(int i = 0; i < command.length(); i ++){
            if(command.charAt(i) == 'G'){
                res += "G";
            }
            else if(command.startsWith("()", i)){
                res += "o";
            } else if (command.startsWith("(al)", i)) {
                res += "al";
            }
        }
        return res;
    }

}

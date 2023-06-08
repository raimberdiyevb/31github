package HakerRank;

public class MarsExploration {
    public static void main(String[] args) {
        System.out.println(marsExploration("SOSTOT"));
        System.out.println(marsExploration("SOSSPSSQSSOR"));
        System.out.println(marsExploration("SSSSSSSSSSSSSSSOOOOOOOOOOOOOOOOOOOOOOOOOSSSSSSSO"));
    }
    public static int marsExploration(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i = i + 3) {
            String word = s.substring(i,i+3);
            if(!word.equals("SOS"))
                res++;
        }
        return res;
    }
}

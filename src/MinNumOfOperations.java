import java.util.Arrays;

public class MinNumOfOperations {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minOperations("001011")));
    }
    public static int[] minOperations(String boxes) {
        /*
        for each box i, iterate through all other boxes and add distance to res[i]
        */
        int[] res = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            for (int j = 0; j < boxes.length(); j++) {
                if(i != j){
                    if(boxes.charAt(j) == '1')
                        res[i] += Math.abs(i-j);
                }
            }
        }
        return res;
    }
}

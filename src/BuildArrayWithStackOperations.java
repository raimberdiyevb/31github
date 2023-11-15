import java.util.ArrayList;
import java.util.List;

public class BuildArrayWithStackOperations {
    public static void main(String[] args) {
        System.out.println(buildArray(new int[]{1,3},3));
    }
    public static List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int[] temp = new int[target.length];
        int current = 0;
        for(int i = 1; i <= n; i++){
            if(target[current] == i){
                temp[current] = i;
                current++;
                res.add("Push");
                if(current == target.length){
                    return res;
                }
            }else{
                res.addAll(List.of("Push","Pop"));
            }
        }
        return res;
    }
}

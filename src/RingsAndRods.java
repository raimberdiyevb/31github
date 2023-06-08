import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class RingsAndRods {
    public static void main(String[] args) {
        System.out.println(countPoints("B0B6G0R6R0R6G9"));
    }
    public static int countPoints(String rings) {
        String[] arr = new String[]{"","","","","","","","","",""};
        AtomicInteger res = new AtomicInteger();
        for(int i = 0; i < rings.length(); i = i + 2 ){
            arr[Integer.parseInt(String.valueOf(rings.charAt(i+1)))] = arr[Integer.parseInt(String.valueOf(rings.charAt(i+1)))] + rings.charAt(i);
        }
        Arrays.stream(arr).forEach(s -> {
            if(s.contains("R") && s.contains("G") && s.contains("B")){
                res.getAndIncrement();
            }
        });
        return Integer.parseInt(String.valueOf(res));
    }
}

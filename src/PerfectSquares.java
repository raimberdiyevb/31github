import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class PerfectSquares {
    public static void main(String[] args) {
        System.out.println(numSquares(7168));
    }
    public static int numSquares(int n){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> s = new HashSet<>();
        int step = 0;
        q.offer(n);
        while(!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int current = q.poll();
                if(!s.add(current)) continue;
                if(current == 0) return step;
                int numberOfNodes = (int) Math.sqrt(current);
                for (int j = numberOfNodes; j >= 1; j--) {
                    q.offer((current - (j*j)));
                }
            }
            step++;
        }
        return 0;
    }
}

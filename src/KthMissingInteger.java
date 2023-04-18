import java.util.ArrayList;

public class KthMissingInteger {
    public static void main(String[] args) {
        findKthPositive(new int[]{2, 3, 4, 7, 11}, 5);
    }
    public static int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> missInt = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            missInt.add(i+1);
        }
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < missInt.size(); j++) {
                if (arr[i] == (int)(missInt.get(j))){
                    missInt.remove(j);
                }
            }
        }

        return missInt.get(k-1);
    }
}

import java.util.ArrayList;
import java.util.Comparator;

public class LastStoneWeight {
    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[] {2,7,4,1,8,1}));
        System.out.println(lastStoneWeight(new int[] {1}));
    }
    public static int lastStoneWeight(int[] stones) {
        int res = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(stones.length < 2)
            res = stones[0];
        else {
            for (int num : stones) {
                arrayList.add(num);
            }
            do {
                arrayList.sort(Comparator.naturalOrder());
                System.out.println("Sorted Arr : ");
                System.out.println(arrayList);
                if (arrayList.get(arrayList.size() - 2) == arrayList.get(arrayList.size() - 1)) {
                    System.out.println("Last and Prelast are equeal!");
                    System.out.println("PreLast Removed: " + arrayList.get(arrayList.size() - 2));
                    arrayList.remove(arrayList.size() - 2);
                    System.out.println("Last removed : " + arrayList.get(arrayList.size() - 1));
                    arrayList.remove(arrayList.size() - 1);
                } else if (arrayList.get(arrayList.size() - 2) != arrayList.get(arrayList.size() - 1)) {
                    System.out.println("Last and prelast are not equal!");
                    int preLast = arrayList.get(arrayList.size() - 2);
                    int difference = arrayList.get(arrayList.size() - 1) - arrayList.get(arrayList.size() - 2);
                    System.out.println("Prelast removed : " + preLast);
                    arrayList.remove(arrayList.size() - 2);
                    arrayList.remove(arrayList.size() - 1);
                    arrayList.add(difference);
                    System.out.println("Value of last changed to : " + difference);
                }
                System.out.println("*".repeat(40));
            } while (arrayList.size() > 1);

            if (!arrayList.isEmpty()) {
                res = arrayList.get(0);
            }
        }
        return res;
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class FindNearestPointThatHasTheSameXOrYCoordinate {
    public static void main(String[] args) {
//        System.out.println(nearestValidPoint(3, 4, new int[][]{{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}}));
        System.out.println(nearestValidPoint(3, 4, new int[][]{{2,3}}));
    }

    public static int nearestValidPoint(int x, int y, int[][] points){
        int res = -1;
        ArrayList<int[]> arr = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            int xPoint = points[i][0];
            int yPoint = points[i][1];
            if(xPoint == x || yPoint == y){
                arr.add(points[i]);
                System.out.println("Point added to arr : " + Arrays.toString(points[i]));
            }
        }
        System.out.println("List of valid points : ");
        arr.forEach(ints -> {
            System.out.print(Arrays.toString(ints) + " ");
        });
        System.out.println();
        int min = Integer.MAX_VALUE;
        int[] minPoint = new int[]{0,0};
        if(!arr.isEmpty()) {
            for (int i = 0; i < arr.size(); i++) {
                int current = Math.abs(x - arr.get(i)[0]) + Math.abs(y - arr.get(i)[1]);
                System.out.println("Current distance : " + current);
                if (current < min) {
                    min = current;
                    minPoint = new int[]{arr.get(i)[0], arr.get(i)[1]};
                }
                System.out.println("Min distance : " + min);
                System.out.println("Min point : " + Arrays.toString(minPoint));
            }

            for (int i = 0; i < points.length; i++) {
                if (Arrays.equals(points[i], minPoint)) {
                    res = i;
                    System.out.println("Res value added " + i);
                }
            }
        }
        return res;
    }
}

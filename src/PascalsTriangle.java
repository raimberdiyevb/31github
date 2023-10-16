import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        printTriangle(getTriangle(10));
        System.out.println(getRow(1));
    }
    public static List<List<Integer>> getTriangle(int rowsNum) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>(List.of(1)));
        triangle.add(new ArrayList<>(List.of(1, 1)));

        if (rowsNum == 2) {
            return triangle;
        } else {
            for (int i = 2; i < rowsNum; i++) {
                List<Integer> arr = new ArrayList<>(i + 1);
                for (int j = 0; j <= i; j++) { // Iterate up to the current row number 'i'
                    if (j == 0 || j == i) {
                        arr.add(1);
                    } else {
                        int first = triangle.get(i - 1).get(j - 1);
                        int second = triangle.get(i - 1).get(j);
                        arr.add(first + second);
                    }
                }
                triangle.add(arr);
            }
        }
        return triangle;
    }
    public static void printTriangle(List<List<Integer>> triangle){
        for(var line : triangle){
            System.out.println(line);
        }
    }
    public static List<Integer> getRow(int rowIndex) {
        return getTriangle(rowIndex+1).get(rowIndex);
    }
}

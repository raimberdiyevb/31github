import java.util.ArrayList;

public class CheckIfEveryRowAndColumnContainsAllNUmbers {
    public static void main(String[] args) {
        System.out.println(checkValid(new int[][]{}));
    }
    public static boolean checkValid(int[][] matrix) {
        boolean res = true;
        for(int i = 0; i < matrix.length; i ++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j = 1; j <= matrix.length; j++ ){
                arr.add(j);
            }
            for(int j = 0; j < matrix.length; j ++){
                if(arr.contains(matrix[i][j])){
                    arr.remove(arr.indexOf(matrix[i][j]));
                }else{
                    return false;
                }
            }
            if(!arr.isEmpty()){
                res = false;
            }
        }
        return res;
    }
}

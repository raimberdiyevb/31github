import java.util.ArrayList;
import java.util.Arrays;

public class ValidSudoku {
    public static void main(String[] args) {

    }
    public static boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++ ){
            ArrayList<Integer> rows = new ArrayList<>();
            ArrayList<Integer> columns = new ArrayList<>();
            for(int j = 0; j < board[i].length; j++ ){
                if(Character.isDigit(board[i][j])){
                    rows.add(Character.getNumericValue(board[i][j]));
                }
                if(Character.isDigit(board[j][i])){
                    columns.add(Character.getNumericValue(board[j][i]));
                }
            }
            int[] rowsArray = new int[rows.size()];
            int[] columnsArray = new int[columns.size()];
            for(int j = 0; j < rows.size(); j++ ){
                rowsArray[j] = rows.get(j);
            }
            for (int j = 0; j < columnsArray.length; j ++){
                columnsArray[j] = columns.get(j);
            }
            if(containsDuplicate(rowsArray) || containsDuplicate(columnsArray)){
                return false;
            }
        }
        for (int i = 1; i < board.length - 1 ; i+=3) {
            ArrayList<Integer> minor = new ArrayList<>();
            for (int j = 0; j < board[i].length - 1 ; j+=3) {
                try{
                    minor.add(Character.getNumericValue(board[i-1][j-1]));
                    minor.add(Character.getNumericValue(board[i-1][j]));
                    minor.add(Character.getNumericValue(board[i-1][j+1]));
                    minor.add(Character.getNumericValue(board[i][j-1]));
                    minor.add(Character.getNumericValue(board[i][j]));
                    minor.add(Character.getNumericValue(board[i][j+1]));
                    minor.add(Character.getNumericValue(board[i+1][j-1]));
                    minor.add(Character.getNumericValue(board[i+1][j]));
                    minor.add(Character.getNumericValue(board[i+1][j + 1]));
                }catch (Exception e) { }
            }
            int[] minorArr = new int[minor.size()];
            for (int k = 0; k < minorArr.length; k++) {
                minorArr[k] = minor.get(k);
            }
            if(containsDuplicate(minorArr)){
                return false;
            }
        }

        return true;
    }
    public static boolean containsDuplicate(int[] nums) {
        int numOfCopies = 0;
        boolean res = false;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1 ; i ++){
            if(nums[i] == nums[i+1]){
                numOfCopies++;
            }
        }
        if(numOfCopies > 0 ){
            res = true;
        }
        return res;
    }
}

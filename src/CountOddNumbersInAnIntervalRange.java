public class CountOddNumbersInAnIntervalRange {
    public static void main(String[] args) {

    }
    public static int countOdds(int low, int high) {
        int res = 0;
        for(int i = low; i <= high ; i++){
            if(i % 2 != 0){
                res ++;
            }
        }
        return res;
    }
}

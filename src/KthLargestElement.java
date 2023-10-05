import java.util.ArrayList;
import java.util.List;

public class KthLargestElement {
    public int k;
    public List<Integer> arr;
    int size = 0;

    public KthLargestElement(int k, int[] nums) {//4582
        this.k = k;
        arr = new ArrayList<>();
        for(int num : nums){
            add(num);
        }
    }

    public int add(int val) {
        if(size == 0){
            arr.add(val);
        }else{
            size++;
            arr.set(size,val);
            int parentIndex = 0;

            if(size % 2 == 0){
                parentIndex = (size / 2)-1;
            }else{
                parentIndex = size/2;
            }
            System.out.println("Parent Index : " +  parentIndex);
            while(arr.get(parentIndex) < arr.get(size) && parentIndex > 0){
                int temp = arr.get(parentIndex);
                arr.set(parentIndex,arr.get(size));
                arr.set(size,temp);
            }
        }
        return -99;
    }
}
class playGround{
    public static void main(String[] args) {

        System.out.println();
    }
}


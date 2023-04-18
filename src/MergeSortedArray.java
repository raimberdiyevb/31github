import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[] {1,2,3,0,0,0}, 3,new int[] {2,5,6}, 3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i = m; i < nums1.length; i++){
            nums1[i] = nums2[j];
            j = j + 1;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}

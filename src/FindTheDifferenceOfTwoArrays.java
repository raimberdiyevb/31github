import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3,3},new int[]{1,1,2,2}));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int num : nums1){
            s1.add(num);
        }
        for(int num : nums2){
            s2.add(num);
        }
        for(int num : s1){
            if(!s2.contains(num)){
                l1.add(num);
            }
        }
        for(int num : s2){
            if(!s1.contains(num)){
                l2.add(num);
            }
        }
        return List.of(l1,l2);
    }
}

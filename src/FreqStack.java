import java.util.ArrayList;
import java.util.HashMap;

public class FreqStack {
    private ArrayList<HashMap<Integer,Integer>> arr;
    public FreqStack() {
        arr = new ArrayList<>();
    }

    public void push(int val) {
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean found = false;
        for(HashMap<Integer,Integer> hashMap : arr){
            if(hashMap.containsKey(val)){
                hashMap.replace(val,hashMap.get(val) + 1);
                found = true;
            }
            if(found) break;
        }
        if(!found){
            map.put(val,1);
            arr.add(map);
        }

    }

    public int pop() {
        int max = -1;
        int res = 0;
        for(HashMap<Integer,Integer> hashMap : arr){
            if(hashMap.values().iterator().next() >= max){
                max = hashMap.values().iterator().next();
                res = hashMap.keySet().iterator().next();
            }
        }
        for (int i = arr.size()-1; i >= 0; i--) {
            if(arr.get(i).values().iterator().next() == max){
                arr.remove(i);
            }
        }
        return res;
    }
}
class Freq{
    public static void main(String[] args) {
        FreqStack freqStack = new FreqStack();
//        freqStack.push(5);
//        freqStack.push(7);
//        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(4);
        freqStack.push(5);
//        System.out.println(freqStack.pop());
//        System.out.println(freqStack.pop());
//        System.out.println(freqStack.pop());
        System.out.println(freqStack.pop());
    }
}

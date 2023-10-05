import java.util.ArrayList;
import java.util.HashMap;

class MinStack {
    private ArrayList<HashMap<Integer,Integer>> data;
    private int min;
    public MinStack() {
        data = new ArrayList<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        int currentMin = Math.min(min,val);
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(currentMin,val);
        data.add(map);
        min = currentMin;
    }

    public void pop() {

        data.remove(data.size()-1);
        if(data.size() == 0){
            min = Integer.MAX_VALUE;
        }else{
            min = data.get(data.size()-1).values().iterator().next();
        }

    }

    public int top() {
        return data.get(data.size()-1).values().iterator().next();
    }

    public int getMin() {
        if(data.size()>0){
            return data.get(data.size()-1).keySet().iterator().next();
        }
        return -1;
    }
}
class M{
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}

public class MinAmountOfTimeToCollectGarbage {
    public static void main(String[] args) {
        System.out.println(garbageCollection(new String[]{"G","P","GP","GG"},new int[]{2,4,3}));
    }
    public static int garbageCollection(String[] garbage, int[] travel) {
        int m = 0;
        int mr = -1;
        int p = 0;
        int pr = -1;
        int g = 0;
        int gr = -1;
        for(int i = 0; i < garbage.length; i++){
            String current = garbage[i];
            for(char c : current.toCharArray()){
                if(c == 'M'){
                    m++;
                    mr = i;
                }else if(c == 'P'){
                    p++;
                    pr = i;
                }else{
                    g++;
                    gr = i;
                }
            }
        }
        mr--;
        pr--;
        gr--;
        for(int i = 0; i < travel.length; i++){
            int num = travel[i];
            if(i <= mr) m+=num;
            if(i <= pr) p+=num;
            if(i <= gr) g+=num;
        }
        return m + p + g;
    }
}

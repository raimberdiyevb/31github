public class TrappingRainWater {
    public static void main(String[] args) {
//        System.out.println("RES : " + trap( new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        System.out.println("RES : " + trap( new int[]{4,2,0,3,2,5}));
    }
//    public static int trap(int[] height){
//        int res = 0;
//        int l = 0;
//        int r = 0;
//        int n = height.length-1;
//        while(height[l] <= 0){
//            l++;
//        }
//        r = l + 1;
//        int blocks = 0;
//        while(r != n){
//            if(height[r] >= height[l]){
//                //calculate water
//                int w = r - l - 1;
//                int h = Math.min(height[l],height[r]);
//                res = res + ((w * h) - blocks);
//                blocks = 0;
//                //move l
//                l = r;
//                r = l + 1;
//            }else{
//                r++;
//                // calculate how much blocks
//                blocks = blocks + height[r-1];
//            }
//            System.out.println(" BLOCKS : " + blocks);
//            System.out.println(" RES    : " + res);
//            System.out.println("***************************");
//        }
//        return res;
//    }
    public static int trap(int[] height){
        int l = 0;
        int r = height.length - 1;
        int lMax = height[l];
        int rMax = height[r];
        int res = 0;

        while(l < r){
            if(lMax < rMax){
                l++;
                lMax = Math.max(lMax,height[l]);
                res += lMax - height[l];
            }else{
                r--;
                rMax = Math.max(rMax,height[r]);
                res += rMax - height[r];
            }
        }
        return res;
    }
}

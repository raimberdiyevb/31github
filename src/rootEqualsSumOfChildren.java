public  class rootEqualsSumOfChildren {
    public static void main(String[] args) {
        System.out.println(checkTree(11,4,6));
    }
    public static boolean checkTree(int root, int left, int right){
        return root == left + right;
    }
}

public class NumberOfIslands {
    public static void main(String[] args) {
        System.out.println(numIslands(new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        }));
    }
    public static int numIslands(char[][] grid){
        int res = 0;
        for(int i = 0; i < grid.length; i ++){
            for (int j = 0; j < grid[i].length; j++) {
                char c = grid[i][j];

                if(c == '1'){
                    char right;
                    char bottom;
                    if(j == (grid[i].length - 1) && (i != (grid.length)-1) ){
                        right = '0';
                        bottom = grid[i+1][j];
                    }
                    else if(i == (grid.length)-1 && (j != (grid[i].length - 1) )){
                        bottom = '0';
                        right = grid[i][j+1];
                    }
                    else if(j != (grid[i].length - 1) && (i != (grid.length)-1) ) {
                        bottom = grid[i + 1][j];
                        right = grid[i][j + 1];
                    }
                    else{
                        right = '0';
                        bottom = '0';
                    }

                    if(right == '1' || bottom == '1'){
                        grid[i][j] = '0';
                    }else{
                        res++;
                    }
                }
            }
        }
        return res;
    }
}

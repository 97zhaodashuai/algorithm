package graphs;

public class dfs {

    private static int inf = 999999;  //代表权值无穷大
    private static int n = 4;  //顶点数
    private static int m = 6;  //边数
    private static int[] book = new int[4];
    private static int[][] e = new int[][] {   //边的邻接矩阵
        {0,1,1,0},
        {1,0,0,0},
        {1,0,0,1},
        {0,0,1,0}
    };


    /**
     * 第一种解法，通过记录顶点是否访问过
     */
    public static void alg_dfs(int i ){
        print(i);
        for(int j = 0; j <n; j++ ){
            if(e[i][j] != 0 && book[j] == 0){  
                book[j] = 1;
                alg_dfs(j);
            }
        }
    }


    /**
     * 从当前顶点的下一个顶点开始访问
     */
    public static void alg_dfs2(int i){
        print(i);
        for(int j = i+1; j<n; j++){
            if(e[i][j] != 0){
                alg_dfs2(j);
            }
        }
    }



    public static void main(String[] args){
        book[0] = 1;
        alg_dfs(0);
    }

    private static void print(int i){
        System.out.print(i + " ");
    }

}
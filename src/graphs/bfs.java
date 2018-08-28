package graphs;
import java.util.Queue;
import java.util.LinkedList;

public class bfs{
    // private static int inf = 999999;  //代表权值无穷大
    private static int n = 4;  //顶点数
    // private static int m = 6;  //边数
    private static int[] book = new int[4];
    private static int[][] e = new int[][] {   //边的邻接矩阵
        {0,1,1,0},
        {1,0,0,0},
        {1,0,0,1},
        {0,0,1,0}
    };

    //java队列的用法
     public void useQueue(){
        Queue<String> queue = new LinkedList<String>();
        //队列尾部添加元素
        queue.add("hello");
        queue.offer("world");

        //返回队列头部元素
        queue.element();
        queue.peek();
        
        //移除并返回队列头部元素
        queue.remove();
        queue.poll();
        
        //队列是否为空
        queue.isEmpty();
        
        //队列的长度
        queue.size();

     }


    public static void _bfs(int i){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(i);
        while(!queue.isEmpty()){
            int v = queue.poll();
            book[v] = 1;
            print(v);
            for(int j = 0; j < n; j++){
                if(e[v][j] != 0 && book[j] == 0){
                    queue.offer(j);
                }
            }
        }
    }


    public static void main(String[] args){
        _bfs(0);
    }

    private static void print(int i){
        System.out.print(i + " ");
    }





}
package sort;

public class quicksort {

    public static void main(String[] args){
//        int[]  a = {7, 4, 9, 1, 3, 0, 8, 2, 5, 6};
        int[] a = {2,0,2,1,2,0};
        int start = 0;
        int end = a.length - 1;
        _sort(a, start, end);

        for(int i = 0 ; i < a.length; i++){
            System.out.print( a[i] + " ");
        }
    }



    public void sort(int[] a){
        int start = 0;
        int end = a.length - 1;
        _sort(a, start, end);

    }


    private static  void _sort( int[] a, int start , int end ){

        if(start >= end){
            return;
        }

        int i = start;
        int j = end;
        while(i != j){
            while(a[j] > a[start] && i != j){
                j--;
            }
            while(a[i] <= a[start] && i != j){
                i++;
            }
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        int temp = a[i];
        a[i] = a[start];
        a[start] = temp;

        _sort(a, start, i-1);
        _sort(a, i+1, end);

    }





}

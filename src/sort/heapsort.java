package sort;

class heapsort {

    public void sort(int[] A){

        build(A);
        for(int i = A.length-1; i >= 0; i--){
            swap(A, 0, i);
            down(A, 0, i);   //error
        }

    }

    private void swap(int[] A, int a , int b){
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }


    private void build(int[] A){
        for(int i = A.length/2; i >=0; i--){  //err
            down(A, i, A.length);
        }
    }


    /**
     * 递归写法
     */
    public void down(int[]A, int p, int end ) {

        int l = p * 2 + 1;
        int r = p * 2 + 2;

        if (l >= end) {
            return;
        }

        int b = l;
        if (r < end && A[l] < A[r]) {
            b = r;
        }

        if (A[p] < A[b]) {
            int temp = A[p];
            A[p] = A[b];
            A[b] = temp;
            down(A, b, end);
        }

    }

//    private void down(int[]A, int p, int end){
//
//        while(p * 2  + 1 < end){
//
//            int l = p * 2 + 1;
//            int r = p * 2 + 2;
//
//            int b = l;
//            if( r < end && A[l] < A[r]){   // error
//                b = r;
//            }
//
//            if(A[p] < A[b]){
//                int temp = A[p];
//                A[p] = A[b];
//                A[b] = temp;
//                p = b;
//            }else{
//                break;
//            }
//        }
//    }

}

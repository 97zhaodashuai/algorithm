package sort;

import java.util.Arrays;

public class sortTest {

    public void exec() {

        heapsort hs = new heapsort();
        quicksort qs = new quicksort();


        long t_jt = 0;
        long t_qt = 0;

        for (int i = 0; i < 10; i++) {

            int[] orig = randArray();
            int[] ra = Arrays.copyOf(orig, orig.length);
            int[] rb = Arrays.copyOf(orig, orig.length);

            long start = System.nanoTime();
            Arrays.sort(ra);
            long end = System.nanoTime();
            long jt = end - start;
            t_jt  += jt;

//            start = System.currentTimeMillis();
//            hs.sort(rb);
//            end = System.currentTimeMillis();



            start = System.nanoTime();
            hs.sort(rb);
            end = System.nanoTime();
            long qt = end - start;
            t_qt += qt;

            checkResult(orig, ra, rb, jt, qt);
        }
        System.out.println( "avg_jt: " + t_jt/1000 + " avg_qt: " +  t_qt/1000);

    }


    private int[] randArray() {

        int length = (int) (Math.random() * 10);

        int[] res = new int[length];

        for (int i = 0; i < length; i++) {
            res[i] = (int) (Math.random() * 10);
        }
        return res;
    }


    private void checkResult(int[] orig, int[] ra, int[] rb, long jt, long qt) {
        boolean eq = true;
        for (int j = 0; j < ra.length; j++) {
            if (ra[j] != rb[j]) {
                System.out.print("err:\r\norig: ");
                for (int k = 0; k < orig.length; k++) {
                    System.out.print(orig[k] + " ");
                }
                System.out.print("\r\n ra: ");

                for (int k = 0; k < orig.length; k++) {
                    System.out.print(ra[k] + " ");
                }
                System.out.print("\r\nrb: ");
                for (int k = 0; k < orig.length; k++) {
                    System.out.print(rb[k] + " ");
                }

                System.out.print("\r\n");
                eq = false;
                break;
            }
        }

        if (eq) {
            System.out.println("eq  jt: " + jt + " qt: " + qt);
        }
    }


}

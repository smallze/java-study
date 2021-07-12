package finalParam;

import java.util.Arrays;

/**
 * @author zzs
 * @date 2021/7/3 14:32
 */
public class FinalTest {

    static final int a;
    final int b;

    static {
        a = 0;
    }

    public FinalTest() {
        b = 10;
    }

    public static void main(String[] args) {
        final int a = 0;
        final int[] arr = new int[]{1, 2, 3};
        arr[2] = 4;
        System.out.println(Arrays.toString(arr));
//        arr=null; // 不可以重新赋值
        FinalTest finalTest = new FinalTest();
        finalTest.outFn(100);
    }


    public void outFn(final int b) {
        final int a = 1;// jdk1.8之后不需要加final
        new Thread() {
            @Override
            public void run() {
                System.out.println(a);
                System.out.println(b);
            }
        }.start();
    }

}

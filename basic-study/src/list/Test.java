package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zzs
 * @date 2021/7/4 19:14
 */
public class Test {

    public static void main(String[] args) {
        int times = 1000;
        List<Integer> arrayList = new ArrayList();
        for (int i = 0; i < times; i++) {
            arrayList.add(i);
        }
        List<Integer> linkedList = new LinkedList();
        for (int i = 0; i < times; i++) {
            linkedList.add(i);
        }

        int times1 = 1000;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < times1; i++) {
            arrayList.remove(i);
        }
        System.out.println(System.currentTimeMillis() - startTime);
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < times1; i++) {
            linkedList.remove(i);
        }
        System.out.println(System.currentTimeMillis() - startTime1);
    }
}

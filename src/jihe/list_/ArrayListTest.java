package jihe.list_;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zzs
 * @date 2021/7/6 10:12
 */
public class ArrayListTest {

    public static void main(String[] args) {
        // list
        ArrayList list = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.remove(1);
        list.get(3);
    }
}

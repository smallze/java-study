package jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author zzs
 * @date 2021/7/13 17:19
 */
public class CollectionExe {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(7);
        list.add(3);
        list.add(43);
        list.add(-2);
        list.add(23);
        list.add(90);
        list.add(18);
        Collections.shuffle(list);
        System.out.println("shuffle 随机" + list);
        Collections.sort(list);
        System.out.println("sort 排序" + list);
        Collections.reverse(list);
        System.out.println("reverse 反转" + list);
        System.out.println("max " + Collections.max(list));
        System.out.println("min " + Collections.min(list));
        Collections.swap(list,0,1);
        System.out.println("swap 交换0和1 位置 "+list);
        Collections.fill(list,100);
        System.out.println("fill 100 "+list);
    }
}

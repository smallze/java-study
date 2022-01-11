package jihe;

import java.util.*;

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
        Collections.swap(list, 0, 1);
        System.out.println("swap 交换0和1 位置 " + list);
        Collections.fill(list, 100);
        System.out.println("fill 100 " + list);

        List<String> list1 = new ArrayList<>();
        list1.add("pg");
        list1.add("sg");
        list1.add("sf");
        list1.add("pf");
        list1.add("pf");
        list1.add("c");
        System.out.println(list1);
        Collections.sort(list1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println("collection sort " + list1);
        System.out.println(Collections.max(list1));
        System.out.println(Collections.min(list1));
        System.out.println(Collections.frequency(list1, "pf"));
        List<String> copyArr = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            copyArr.add("");
        }
        Collections.copy(copyArr, list1);
        System.out.println("copy " + copyArr);
        Collections.replaceAll(list1,"pf","changed pf");
        System.out.println(list1);
    }
}

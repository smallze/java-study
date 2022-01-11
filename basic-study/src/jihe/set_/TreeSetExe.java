package jihe.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author zzs
 * @date 2021/7/13 9:07
 */
public class TreeSetExe {
    public static void main(String[] args) {
//        TreeSet treeSet = new TreeSet();
//        treeSet.add("lebron");
//        treeSet.add("kobe");
//        treeSet.add("mj");
//        System.out.println(treeSet);
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        set.add("lebron");
        set.add("kobe");
        set.add("mj");
        set.add("ls");
        System.out.println(set);
    }
}

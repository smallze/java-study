package jihe.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author zzs
 * @date 2021/7/13 8:46
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("pg", "lin");
        treeMap.put("sg", "kobe");
        treeMap.put("sf", "young");
        treeMap.put("pf", "kerry");
        treeMap.put("c", "hill");
        System.out.println(treeMap);
        TreeMap treeMap1 = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        treeMap1.put("tom","汤姆");
        treeMap1.put("jerry","杰瑞");
        treeMap1.put("kobe","科比");
        treeMap1.put("lebron","勒布朗");
        treeMap1.put("lin","林书豪");
        System.out.println(treeMap1);
    }
}

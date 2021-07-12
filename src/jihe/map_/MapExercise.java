package jihe.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 练习
 *
 * @author zzs
 * @date 2021/7/11 22:23
 */
public class MapExercise {

    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("1", 2000);
        map.put("2", 3000);
        map.put("3", 10000);
        map.put("4", 20000);
        map.put("5", 30000);
        System.out.println("第一种entrySet 增强for");
        Set entrySet = map.entrySet();
        for (Object o : entrySet) {
            Map.Entry entry = (Map.Entry) o;
            if ((int) entry.getValue() > 18000) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println("第二种entrySet 迭代器");
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            if ((int) entry.getValue() > 18000) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println("第二种keySet 遍历");
        Set keySet = map.keySet();
        for (Object o : keySet) {
            if ((int) map.get(o) > 18000) {
                System.out.println(o);
            }
        }
    }


}

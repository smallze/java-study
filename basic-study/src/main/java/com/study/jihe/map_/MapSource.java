package com.study.jihe.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zzs
 * @date 2021/7/8 21:18
 */
public class MapSource {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("n1", "kobe");
        map.put("n2", "lbj");
        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object o : set) {
            System.out.println(o.getClass());
            Map.Entry mapEntry = (Map.Entry) o;
            System.out.println(mapEntry.getKey() + ":" + mapEntry.getValue());
        }
        Set keySet = map.keySet();
        for (Object o : keySet) {
            System.out.println(o.getClass());
            System.out.println(o);
        }
    }
}

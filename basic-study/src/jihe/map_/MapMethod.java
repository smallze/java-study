package jihe.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zzs
 * @date 2021/7/8 21:40
 */
public class MapMethod {

    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("n1","11");
        map.size();
        System.out.println(map.containsKey("n1"));
        map.clear();
    }
}

package jihe;

import java.util.TreeSet;

/**
 * @author zzs
 * @date 2021/7/14 14:07
 */
public class Homework3 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(new Person());
    }


}

class Person implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

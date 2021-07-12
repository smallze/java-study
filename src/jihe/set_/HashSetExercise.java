package jihe.set_;

import java.util.HashSet;

/**
 * @author zzs
 * @date 2021/7/8 14:04
 */
public class HashSetExercise {
    public static void main(String[] args) {
        // 姓名加年龄相同的不能插入
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("jack", 10));
        hashSet.add(new Employee("rose", 10));
        hashSet.add(new Employee("linda", 10));
        hashSet.add(new Employee("jack", 10));
        System.out.println(hashSet);
        // 姓名加年龄加生日相同的不能插入，生日的类是MyDate类型
        HashSet hashSet1 = new HashSet();
        hashSet1.add(new EmployeeExt("jack", 10, new MyDate(2020, 10, 1)));
        hashSet1.add(new EmployeeExt("rose", 10,new MyDate(2021,1,1)));
        hashSet1.add(new EmployeeExt("jack", 10,new MyDate(2021,1,1)));
        hashSet1.add(new EmployeeExt("jack", 10,new MyDate(2020,10,1)));
        System.out.println(hashSet1);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class EmployeeExt {
    private String name;
    private int age;
    private MyDate birth;

    public EmployeeExt(String name, int age, MyDate birth) {
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeExt that = (EmployeeExt) o;

        if (age != that.age) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return birth != null ? birth.equals(that.birth) : that.birth == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (birth != null ? birth.hashCode() : 0);
        return result;
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyDate myDate = (MyDate) o;

        if (year != myDate.year) return false;
        if (month != myDate.month) return false;
        return day == myDate.day;
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + month;
        result = 31 * result + day;
        return result;
    }
}

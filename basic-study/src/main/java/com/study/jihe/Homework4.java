package com.study.jihe;

import java.util.HashSet;

/**
 * @author zzs
 * @date 2021/7/14 14:19
 */
public class Homework4 {

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Employee aa = new Employee("AA", "Jack");
        Employee bb = new Employee("BB", "Rose");
        hashSet.add(aa);
        hashSet.add(bb);
        System.out.println("hashSet " + hashSet);
        aa.name = "Kobe";
        System.out.println("update aa.name " + hashSet);
        hashSet.remove(aa);
        // 修改元素后不会修改hashCode,仍然在原位置，修改后的元素计算hashCode就不会指向原索引，所以删除不掉
        System.out.println("remove aa " + hashSet);
        hashSet.add(new Employee("CC", "MJ"));
        System.out.println("add cc " + hashSet);
        hashSet.add(new Employee("AA", "Jack"));
        System.out.println("add aa jack " + hashSet);
    }
}

class Employee {
    public String deptNo;
    public String name;

    public Employee(String deptNo, String name) {
        this.deptNo = deptNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (deptNo != null ? !deptNo.equals(employee.deptNo) : employee.deptNo != null) return false;
        return name != null ? name.equals(employee.name) : employee.name == null;
    }

    @Override
    public int hashCode() {
        int result = deptNo != null ? deptNo.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "deptNo='" + deptNo + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
package com.study.jihe.set_;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author zzs
 * @date 2021/7/8 16:53
 */
public class LinkedHashSetExercise {

    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new Car("现代",10_0000d));
        set.add(new Car("奔驰",50_0000d));
        set.add(new Car("法拉利",300_0000d));
        set.add(new Car("现代",10_0000d));
        System.out.println(set);
    }
}

class Car{
    private String name;
    private Double price;

    public Car(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (name != null ? !name.equals(car.name) : car.name != null) return false;
        return price != null ? price.equals(car.price) : car.price == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
package com.study.hashCodeString;


import java.util.HashSet;

/**
 * @author zzs
 * @date 2021/7/4 14:16
 */
public class Test {


    public static void main(String[] args) {
        String str1 = "11111";
        String str2 = "11111";
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode() == str2.hashCode());
        System.out.println(str1.hashCode());
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hello");
        hashSet.add("hello");
        hashSet.add("world");
        System.out.println(hashSet.toString());

        Person person = new Person();
        person.setName("jerry");
        Person person1 = new Person();
        person1.setName("jerry");
        System.out.println(person.equals(person1));
        Person person2 = person;
        System.out.println(person.equals(person2));
        System.out.println(person.hashCode() == person2.hashCode());

    }
}

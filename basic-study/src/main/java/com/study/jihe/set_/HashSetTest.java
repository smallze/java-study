package com.study.jihe.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author zzs
 * @date 2021/7/6 22:38
 */
public class HashSetTest {

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("walt");
        hashSet.add("jessie");
        hashSet.add("walt");
        hashSet.add(new Player("kobe"));
        hashSet.add(new Player("jordan"));
        hashSet.add(new Player("kobe"));
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next.toString());
        }
    }

    private void fn() {
        Set set = new HashSet();
        set.add("tom");
        set.add("jerry");
        set.add("jordan");
        set.add("kobe");
        System.out.println(set.add("james"));
        System.out.println(set.add("james"));
        set.add(null);
        set.add("");
        set.add("");
        set.add(null);
        for (int i = 0; i < 10; i++) {
            System.out.println(set);
        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        for (Object o : set) {
            System.out.println(o);
        }
        set.remove("james");
    }

    private void simulate(){
        DxNode[] dxNodes = new DxNode[16];
        DxNode jordan = new DxNode("jordan", null);
        dxNodes[1] = jordan;
        System.out.println(dxNodes);
        DxNode kobe = new DxNode("kobe", null);
        jordan.next = kobe;
        System.out.println(dxNodes);
        DxNode lbj = new DxNode("lbj", null);
        kobe.next = lbj;
        System.out.println(dxNodes);
    }
}

class DxNode {
    Object item;
    DxNode next;

    DxNode(Object item, DxNode next) {
        this.item = item;
        this.next = next;
    }
}

class Player{

   String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Player player = (Player) o;
        return name != null ? name.equals(player.name) : player.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
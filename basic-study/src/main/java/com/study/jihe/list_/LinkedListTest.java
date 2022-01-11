package com.study.jihe.list_;

import java.util.LinkedList;

/**
 * @author zzs
 * @date 2021/7/6 18:49
 */
public class LinkedListTest {

    public static void main(String[] args) {
        // 模拟链表
        LinkedListTest linkedListTest = new LinkedListTest();
        linkedListTest.nodeTest();
        LinkedList list = new LinkedList();
        list.add("jerry");
        list.add("tom");
        list.add("lebron");
        list.add("oldWang");
        list.add("wade");
        list.add("lin");
        System.out.println(list);
        list.remove();
        System.out.println("remove:" + list);
        list.set(list.size() - 1, "kobe");
        System.out.println("set" + list);
        list.get(2);
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list);
    }

    private void nodeTest() {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node zzs = new Node("zzs");
        jack.next = tom;
        tom.next = zzs;
        tom.pre = jack;
        zzs.pre = tom;
        Node first = jack;
        // 从头到尾遍历
        System.out.println("从头到尾遍历");
        while (true) {
            if (null == first) {
                break;
            }
            System.out.println(first.toString());
            first = first.next;
        }
        // 插入node
        Node lebron = new Node("lebron");
        lebron.pre = tom;
        lebron.next = zzs;
        tom.next = lebron;
        zzs.pre = lebron;
        // 从尾到头遍历
        System.out.println("从尾到头遍历");
        Node last = zzs;
        while (true) {
            if (null == last) {
                break;
            }
            System.out.println(last.toString());
            last = last.pre;
        }
    }
}

//定义一个双向链表
class Node {
    //指向前一个节点
    public Node pre;
    //指向后一个节点
    public Node next;
    // 存放数据
    public Object item;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node name " + item;
    }
}
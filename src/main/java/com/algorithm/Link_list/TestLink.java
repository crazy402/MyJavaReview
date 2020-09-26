package com.algorithm.Link_list;

/**
 *单链表操作测试类
 * @author crazy402
 */
public class TestLink {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode(1);
        myLinkedList.addNode(4);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);

        myLinkedList.printLink();

        myLinkedList.linkSort();

        myLinkedList.printLink();

        myLinkedList.distinctLink();

        myLinkedList.printLink();



    }
}

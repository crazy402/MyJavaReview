package com.algorithm.Link_list;

import java.util.Hashtable;

/**
 *单链表常见算法
 * @author crazy402
 */
public class MyLinkedList {
    /**
     * 先定义头节点
     */
    Node head = null;

    /**
     * 链表添加节点
     * 先找到末尾节点，把新添加的数据作为尾指针节点的后续节点
     * @param data
     */
    public void addNode(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    /**
     * 求链表的长度
     * @return
     */
    public int length() {
        int length = 0;
        Node curNode = head;
        while (curNode != null) {
            length++;
        }
        return length;
    }

    /**
     * 链表删除节点
     * 把要删除的节点的前节点指向删除节点的后节点
     * @param index
     */
    public Boolean deleteNode(int index) {
        //待删除结点不存在
        if (index < 1 || index > length()) {
            return false;
        }
        //删除头结点
        if (index == 1) {
            head = head.next;
            return true;
        }

        Node preNode = head;
        Node curNode = head.next;
        int i = 1;
        //寻找到待删除结点
        while (curNode != null) {
            if (i == index) {
                //待删除结点的前结点指向待删除结点的后结点
                preNode.next = curNode.next;
                return true;
            }
            //当先结点和前结点同时向后移
            preNode = preNode.next;
            curNode = curNode.next;
            i++;
        }
        return true;
    }

    /**
     * 链表节点排序，并返回排序后的头节点
     * 选择排序法，即每次选出排序节点中最小的节点，与第一个节点换位
     * @return
     */
    public Node linkSort() {
        Node curNode = head;
        while (curNode != null) {
            Node nextNode = curNode.next;
            while (nextNode != null) {
                if (curNode.data > nextNode.data) {
                    int temp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
        return head;
    }

    /**
     * 打印链表
     */
    public void printLink() {
        Node curNode = head;
        while (curNode != null) {
            System.out.println(curNode.data + "");
            curNode = curNode.next;
        }
    }

    /**
     * 去掉重复的元素
     * 需要额外的hashtable，调用hashtable.containsKey()来判断重复结点
     */
    public void distinctLink() {
        Node temp = head;
        Node pre = null;

        Hashtable<Integer, Integer> hb = new Hashtable<>();
        while (temp != null) {
            //如果hashtable中已存在该结点，则跳过该结点
            if (hb.containsKey(temp.data)) {
                pre.next = temp.next;
            }else {
                hb.put(temp.data, 1);
                pre = temp;
            }
            temp = temp.next;
        }

    }



}

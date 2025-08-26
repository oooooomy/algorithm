package org.oooooomy.list;

import java.util.*;

/**
 * 146. LRU 缓存
 */
public class LRUCache {

    Map<Integer, Node> map;

    int capacity;

    static class Node {
        int val;
        Node prev, next;
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
    }

    public int get(int key) {
        Node node = map.get(key);
        return node == null ? -1 : node.val;
    }

    /**
     * 如果关键字 key 已经存在，则变更其数据值 value ；
     * 如果不存在，则向缓存中插入该组 key-value 。
     * 如果插入操作导致关键字数量超过 capacity ，则应该 逐出 最久未使用的关键字。
     *
     * @param key   k
     * @param value v
     */
    public void put(int key, int value) {
        //存在
        if (map.containsKey(key)) {
            map.get(key).val = value;
            return;
        }
        //不存在
        if (map.size() < this.capacity) {
            Node node = new Node();
            node.val = value;
            node.prev = null;
            node.next = null;
            map.put(key, node);
            //TODO insert linked list
        } else {
            //TODO 删除map对应元素
            //TODO 删除链表元素
            //TODO 插入链表元素
        }
    }

}
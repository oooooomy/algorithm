package org.oooooomy.list;

import java.util.*;

/**
 * 146. LRU 缓存
 */
public class LRUCache {

    private static class Node {
        int key, val;
        Node prev, next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private final Map<Integer, Node> map;
    private final int capacity;
    private final Node dummy = new Node(0, 0);

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        dummy.next = dummy;
        dummy.prev = dummy;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        //node最近使用，放在最头部节点
        refresh(node);
        return node.val;
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
            Node node = map.get(key);
            node.val = value;
            refresh(node);
            return;
        }
        //不存在
        if (map.size() == this.capacity) {
            removeLast();
        }
        Node node = offerFirst(key, value);
        map.put(key, node);
    }

    private void refresh(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;

        node.next = dummy.next;
        node.next.prev = node;

        dummy.next = node;
        node.prev = dummy;
    }

    private void removeLast() {
        Node deleted = dummy.prev;
        dummy.prev = deleted.prev;
        deleted.prev.next = dummy;
        map.remove(deleted.key);
    }

    private Node offerFirst(int key, int value) {
        Node next = dummy.next;
        Node node = new Node(key, value);
        node.next = next;
        next.prev = node;
        dummy.next = node;
        node.prev = dummy;
        return node;
    }

}
package com.nowcoder.community.lc;

/**
 * 删除链表中的倒数第n个节点
 */

public class LC19 {
    public Node removeNthFromEnd(Node head, int n) {
        Node dummyHead = new Node(0);
        dummyHead.next = head;
        Node p = head;
        Node q = dummyHead;
        for (int i = 0; i < n; i++) {
            p = p.next;
        }
        while (p != null) {
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return dummyHead.next;
    }
}


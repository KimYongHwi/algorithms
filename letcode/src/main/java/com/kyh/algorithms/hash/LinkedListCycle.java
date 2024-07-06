package com.kyh.algorithms.hash;

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {

    // Floyd의 순환찾기 알고리즘
    // 속도가 다른 두개의 포인터를 루프에 진입시켜 진행하다보면 순환일 경우 결국 같은 노드를 가르키게 된다는 심플한 개념이다.
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        boolean hasCycle = false;

        ListNode fastNode = head;
        ListNode slowNode = head;

        while(fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;

            if(fastNode == slowNode) {
                hasCycle = true;
                break;
            }
        }

        return hasCycle;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode tail = new ListNode(-4);

        head.next = node1;
        node1.next = node2;
        node2.next = tail;
        tail.next = node1;

        var cycle = new LinkedListCycle();
        cycle.hasCycle(head);
    }
}

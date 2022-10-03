package com.roshan.datastructures;

import com.roshan.datastructures.nodes.ListNode;

public class LinkedList {
    ListNode head;

    public void append(int new_val) /* adds to the end of the list */ {
        /* Allocate the Node &
         Put in the data
        Set next as null */
        ListNode new_node = new ListNode(new_val);

        /* If the Linked List is empty, then make the
        new node as head */
        if (head == null)
        {
            head = new ListNode(new_val);
            return;
        }

        /* This new node is going to be the last node, so
         make next of it as null */
        new_node.next = null;

        /* 5. Else traverse till the last node */
        ListNode last = head;
        while (last.next != null)
            last = last.next;

        /* Change the next of last node */
        last.next = new_node;
        return;
    }
    public void push(int new_val) /* adds to rhe front of the list */ {
        /* Allocate the Node & Put in the data*/
        ListNode new_node = new ListNode(new_val);
        /* Make next of new Node as head */
        new_node.next = head;
        /* Move the head to point to new Node */
        head = new_node;
    }
    public void insertAfter(Node prev_node, int new_data) {
        /* Check if the given Node is null */
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        /* Allocate the Node & Put in the data*/
        ListNode new_node = new ListNode(new_data);
        /* Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;
        /* make next of prev_node as new_node */
        prev_node.next = new_node;
    }
    public void printList() {
        ListNode n = head;
        while (n != null) {
            System.out.print(n.val + " ");
            n = n.next;
        }
    }
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList llist = new LinkedList();

        llist.head = new ListNode(1);
        llist.append(2);
        llist.append(3);

        llist.push(21);

        llist.insertAfter(llist.head, 14);

        // Function call
        llist.printList();
    }
}
package com.roshan.datastructures.nodes;

import org.w3c.dom.Node;

public class ListNode<T> extends NodeBase {

    ListNode<T> prev;
    ListNode<T> next;

    ListNode(T t){
        super(t);
        prev = null;
        next = null;
    }
}
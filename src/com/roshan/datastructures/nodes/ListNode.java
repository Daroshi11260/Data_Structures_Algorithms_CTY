package com.roshan.datastructures.nodes;

import org.w3c.dom.Node;

public class ListNode<T> extends NodeBase {

    ListNode<T> _prev;
    ListNode<T> _next;

    ListNode(T t){
        super(t);
        _prev = null;
        _next = null;
    }
}
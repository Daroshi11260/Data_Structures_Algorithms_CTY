package com.roshan.datastructures.nodes;

public abstract class NodeBase<T> implements Comparable<T> {
    T _val;

    NodeBase(T t) {
        _val = t;
    }

    @Override
    public String toString(){
        return"Node{" + "_val=" + _val +"}";
    }
}
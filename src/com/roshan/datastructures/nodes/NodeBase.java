package com.roshan.datastructures.nodes;

public abstract class NodeBase<T> implements Comparable<T> {
    T val;

    NodeBase(T t) {
        val = t;
    }

    @Override
    public String toString(){
        return"Node{" + "_val=" + val +"}";
    }
}
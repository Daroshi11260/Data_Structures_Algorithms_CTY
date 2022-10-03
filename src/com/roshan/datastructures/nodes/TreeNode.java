package com.roshan.datastructures.nodes;

public class TreeNode<T> extends NodeBase {

    TreeNode<T> _left;
    TreeNode<T> _mid;
    TreeNode<T> _right;

    TreeNode(T t){
        super(t);
        _left = null;
        _mid = null;
        _right = null;
    }
}
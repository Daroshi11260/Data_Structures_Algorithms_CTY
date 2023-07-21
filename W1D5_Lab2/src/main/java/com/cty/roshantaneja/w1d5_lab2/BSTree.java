package com.cty.roshantaneja.w1d5_lab2;

import java.util.Comparator;
import java.util.List;

public class BSTree<T extends Comparable<T>> {
    private BSTNode<T> root;
    private Comparator<? super T> comparator;

    private class BSTNode<T extends Comparable<T>> {

    }

    public BSTree() {
        this(null);
    }

    public BSTree( Comparator<? super T> comp ){

    }

    public void add( T data ){
    }


    public void clear() {

    }

    public void removeAll( T data ){

    }

    public boolean remove( T data ) {
        return false;
    }

    private boolean removeNode( BSTNode<T> me, BSTNode<T> parent ){
        return true;
    }

    public List<T> preOrder(){
        return null;
    }
    private void preOrderHelper( BSTNode<T> curr, List<T> list ){
    }

    public List<T> inOrder() {
       return null;
    }
    private void inOrderHelper( BSTNode<T> curr, List<T> list ){
    }

    public List<T> postOrder() {
       return null;
    }
    private void postOrderHelper( BSTNode<T> curr, List<T> list){
    }

    private class NaturalOrdering<T extends Comparable<T>> implements Comparator<T>{
        @Override
        public int compare(T left, T right) {
            return left.compareTo(right);
        }
    }

}


package datastructure.heap;

import datastructure.list.MyArrayList;

public class MyHeap<T extends Comparable<T>> implements IMyHeap<T> {

    private MyArrayList<T> list;


    @Override
    public IMyHeap<T> buildMaxHeap() {
        return null;
    }

    @Override
    public IMyHeap<T> buildMinHeap() {
        return null;
    }
}

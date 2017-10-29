package datastructure.list;

import datastructure.exceptions.NoElementAtPositionException;

public class MyArrayList<T> {

    private static final int DEFAULT_ARRAY_INIT_SIZE = 12;
    private Object[] internalArray;
    private int lastElementPosition;
    private int arraySize;

    public MyArrayList() {
        internalArray = new Object[DEFAULT_ARRAY_INIT_SIZE];
        lastElementPosition = -1;
        arraySize = DEFAULT_ARRAY_INIT_SIZE;
    }

    public boolean add(T item) {
        internalArray[++lastElementPosition] = item;
        if (lastElementPosition / arraySize == 1) {
            arraySize = (int) Math.round(arraySize * 1.5);
            Object[] tmp = new Object[arraySize];
            System.arraycopy(internalArray, 0, tmp, 0, lastElementPosition + 1);
            internalArray = tmp;
        }
        return true;
    }

    public T get() {
        return get(lastElementPosition);
    }

    public T get(int position) {
        if (position < 0 || position > lastElementPosition) {
            throw new NoElementAtPositionException(position, lastElementPosition);
        }
        return (T) internalArray[position];
    }

    public int size() {
        return lastElementPosition + 1;
    }
}

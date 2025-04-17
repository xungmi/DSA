package ongdev.dynamicarray;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class DynamicArray<T> implements Iterable<T> {
    private T[] arr;
    private int capacity = 0;
    private int size = 0;

    public DynamicArray(){
        this(10);
    }

    public DynamicArray(int capacity){
        if (capacity < 0) throw new IllegalArgumentException("Capacity cannot be negative: " + capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public T get(int index){
        return arr[index];
    }

    public void set(int index, T element){
        arr[index] = element;
    }

    public void clear(){
        for (int i = 0 ; i < size; i++){
            arr[i] = null;
        }
        size = 0;
    }

    public void add(T element){
        if (size >= capacity-1){
            if (capacity == 0) capacity = 1;
            else {
                capacity *= 2;
            }

            T[] newArr = (T[]) new Object[capacity];
            for (int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size++] = element;
    }

    public void removeAt(int removeIdx){
        if (removeIdx >= size || removeIdx < 0) throw new IndexOutOfBoundsException("index out of size");

        T[] newArr = (T[]) new Object[size-1];
        for (int oldArrIdx = 0, newArrIdx = 0; oldArrIdx < size; oldArrIdx++, newArrIdx++){
            if (oldArrIdx == removeIdx){
                newArrIdx--;
            } else {
                newArr[newArrIdx] = arr[oldArrIdx];
            }
        }
        arr = newArr;
        capacity = --size;
    }

    public void remove(Object object){
        int removeIdx = indexOf(object);
        removeAt(removeIdx);
    }

    public int indexOf(Object o){
        for (int i = 0; i < size; i++){
            if (o == null){
                if (arr[i] == null) return i;
            } else {
                if(o.equals(arr[i])){
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean contains(Object o){
        return indexOf(o) != -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < size();
            }

            @Override
            public T next() {
                return arr[++index];
            }
        };
    }

    @Override
    public String toString() {
        if (size() == 0){
            return "[]";
        } else {
            StringBuilder builder = new StringBuilder();
            builder.append("[");
            for (int i = 0; i < size-1; i++){
                builder.append(arr[i]).append(", ");
            }
            builder.append(arr[size-1]).append("]");
            return builder.toString();
        }
    }
}
//https://www.youtube.com/watch?v=MtSDY_kuM7o&list=PLoaAbmGPgTSNMAzkKBHkh2mLuBk54II5L&index=5
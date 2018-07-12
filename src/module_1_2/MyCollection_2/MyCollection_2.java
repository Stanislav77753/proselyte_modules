package module_1_2.MyCollection_2;

import java.util.Iterator;

public class MyCollection_2<T> implements  Iterable {
    private final int capacity;
    private T[] array;
    private int size;
    public MyCollection_2(){
        capacity = 16;
        array = (T[])new Object[capacity];
        size = 0;
    }

    public MyCollection_2(int initCapacity){
        capacity = initCapacity;
        array = (T[])new Object[capacity];
        size = 0;
    }

    public void add(T element){
        if(size == capacity){
            T[] tempArray = (T[])new Object[capacity];
            System.arraycopy(array, 1, array, 0, size - 1);
            array[size - 1] = element;
        }
        else{
            array[size] = element;
            size++;
        }
    }

    @Override
    public Iterator iterator() {
        Iterator iterator = new Iterator() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public Object next() {
                return array[currentIndex++];
            }

        };
        return iterator;
    }
}

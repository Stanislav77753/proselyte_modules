package module_1_2.MyCollection_1;

import java.util.Arrays;
import java.util.Collection;

public class MyCollection_1 {

    private int initCapacity;
    private int[] array;
    private int size;

    public MyCollection_1(){
        initCapacity = 10;
        array = new int[10];
        size = 0;
    }

    public MyCollection_1(int initCapacity){
        this.initCapacity = initCapacity;
        array = new int[this.initCapacity];
        size = 0;
    }

    public boolean add(int element){
        if(size == initCapacity){
            int[] tempArray = new int[initCapacity];
            for(int i = 0; i < size; i++){
                tempArray[i] = array[i];
            }
            initCapacity = initCapacity * 3 / 2;
            array = new int[initCapacity];
            for(int i = 0; i < size; i++){
                array[i] = tempArray[i];
            }
        }
        if(size == 0){
            array[size] = element;
            size++;
        }
        else{
            for(int i = 0; i < size;i++){
                array[i]+=element;
            }
            array[size] = element;
            size++;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MyCollection_1{" +
                "initCapacity=" + initCapacity +
                ", array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}

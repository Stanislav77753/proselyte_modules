package module_1_2;

import module_1_2.MyCollection_1.MyCollection_1;

import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        MyCollection_1 myCollection_1 = new MyCollection_1();
        System.out.println(myCollection_1.findMaxElement());
        for(int i = 0; i < 13; i++){
            myCollection_1.add(1);
        }
        Iterator iterator = myCollection_1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

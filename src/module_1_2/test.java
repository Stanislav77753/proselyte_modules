package module_1_2;

import module_1_2.MyCollection_1.MyCollection_1;

public class test {
    public static void main(String[] args) {
        MyCollection_1 myCollection_1 = new MyCollection_1();
        for(int i = 0; i < 12; i++){
            myCollection_1.add(1);
        }
        System.out.println(myCollection_1);
    }
}

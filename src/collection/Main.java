package collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");

//        System.out.println(list1);

        Iterator<String> iterator1 = list1.iterator();
//        iterator1.next();
//        iterator1.next();
        while (iterator1.hasNext()){
            String element = iterator1.next();
            System.out.println(element);
        }

        System.out.println("------------");
        for (String element:list1) {
//            System.out.println(element);
        }
    }
}

class Iterator2{
    private String element;
    public void hasNext(){

    }

    public String next(){
        return element;
    }

    public void remove(){
        element = null;
    }
}

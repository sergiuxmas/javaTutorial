package scanner;

import java.util.*;

public class MainScanner {
    public static void main(String[] args) {
        definePrimitives(100);
    }

    private static void definePrimitives(int max){
        List<Integer> primitiveList = new ArrayList<>();
        for (int i=2; i<=max; i++){
            int currentPrimitive=0;
            for (int primitive:primitiveList) {
                currentPrimitive = primitive;
                if (i%primitive==0){
                    break;
                }
            }
            if (primitiveList.isEmpty()){
                primitiveList.add(i);
            } else if (currentPrimitive==primitiveList.get(primitiveList.size()-1)) {
                primitiveList.add(i);
            }
        }
        System.out.println(primitiveList);
    }


}

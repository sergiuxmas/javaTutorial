package collection.comparation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        GenericCollection c1 = new GenericCollection(new ArrayList<>());
        c1.addALl(11);
//        c1.printCollection();
//        c1.remove(5);
//        c1.printCollection();

        GenericCollection c2 = new GenericCollection(new LinkedHashSet<>());
        c2.addALl(11);
        c2.printCollection();
//        c2.remove(5);
        c2.remove(new int[]{5,7});
        c2.printCollection();
    }
}

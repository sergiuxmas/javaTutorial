package collection.generic;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringDataDao coll_AL = new StringDataDao<>(ArrayList.class);
        coll_AL.setData(11);
        coll_AL.printData();
        coll_AL.removeElement(5);
        coll_AL.printData();

        StringDataDao coll_LL = new StringDataDao<>(LinkedList.class);
        coll_LL.setData(11);
//        coll_LL.printData();

        StringDataDao coll_HS = new StringDataDao<>(HashSet.class);
        coll_HS.setData(11);
//        coll_HS.printData();

        StringDataDao coll_TS = new StringDataDao<>(TreeSet.class);
        coll_TS.setData(11);
//        coll_TS.printData();

        StringDataDao coll_LS = new StringDataDao<>(LinkedHashSet.class);
        coll_LS.setData(11);
//        coll_LS.printData();
    }
}

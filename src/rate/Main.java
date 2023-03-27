package rate;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Currency currency1 = Currency.MDL;
//        System.out.println(currency1.name());

        /*
        Map description
         */
//        Map<String, String> fruits = new HashMap();
//        fruits.put("orange","mandarine");
//        fruits.put("yellow","banana");
//        System.out.printf(fruits.get("yellow"));

        Map<String, Double> rate = new HashMap<>();
        rate.put("USD-MDL",19.70);

        Rate rateUSDToMDL_1 = new Rate();
        Rate rateUSDToMDL_2 = new Rate(100L);
        Rate rateUSDToMDL_3 = new Rate(Currency.USD, Currency.MDL, 20.56);

        Object rate4 = rateUSDToMDL_3;

        System.out.println(rateUSDToMDL_1);
        System.out.println(rateUSDToMDL_2);
        System.out.println(rateUSDToMDL_3);

        /*
        java class vs object
        Object: toString(), equals [Comparator, Sort]

        Map, HashMap, Set, HashSet
        Abstract, Interface
        Wrappers: double -> Double
        private Constructor
         */

    }
}

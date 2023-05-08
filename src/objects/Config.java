package objects;

//import rate.Rate;

import java.util.Collection;

public class Config extends Object {
    private Rate rate;
    public static String version = "1.0.0-snapshot";

    public Config() {
//        super();
        rate = new Rate();
    }

    public static void main(String[] args) {
//        Config config = new Config();
//        Rate rate1 = new Rate();
//        rate1.setId(10L);
//
//        rate.Rate rate2 = new rate.Rate();
//        rate2.setId(10L);
//
//        Rate rate3 = new Rate();
//        rate3.setId(10L);
//
//        System.out.println(rate1.hashCode());
//
//        System.out.println(rate1.equals(rate3));
//        System.out.println(rate1.toString());
//        System.out.println(rate1.getId() == rate2.getId());
//
//        System.out.println(rate1);
//        System.out.println(r1.getId());

//        for (String arg: args) {
//            System.out.println(arg);
//        }
        String var = System.getenv("JAVA_HOME");
        System.out.println(var);

//        for (String arg: args) {
//            switch (arg){
//                case "-version": {
//                    System.out.println(version);
//                    break;
//                }
//                default: {
//
//                }
//            }
//        }
    }

    public class Solution {

    }

}

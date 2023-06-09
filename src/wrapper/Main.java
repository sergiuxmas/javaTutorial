package wrapper;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        Integer b = new Integer(10);
        Integer v = 10;
        String s = "10";
        Integer k = Integer.valueOf(s);
        System.out.println("k = " + k);

        int c = b.intValue();

        int abc = 20;
        int bd = abc;
        int as = abc;

        Integer abcWrapper = abc;
        Integer bdWrapper = abcWrapper;
        Integer asWrapper = abc;

        Person p = new Person("vasea");
        p.setAge(10);
        System.out.println(p.getCarCount());
        p.readCarCount("BMW");
        System.out.println(p.getCarCount());

    }
}

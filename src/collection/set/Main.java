package collection.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] i = new int[100];
        i[0] = 1;

        List<String> ar = new ArrayList();
        /*
        size = 0;
        capacity = 0;
         */
        ar.add("a");
        ar.add("b11");
        /*
        size = 11;
        capacity = 20
         */


        String text = "Hello world! This is a sample text file. Text file, hello world!";
        String[] words = text.split("[^a-zA-Z]+");
        List<String> collection = Arrays.asList(words);
        Set<String> s = new TreeSet<>();
        s.addAll(collection);
        for (String word: s) {
            System.out.println(word);
        }
    }
}

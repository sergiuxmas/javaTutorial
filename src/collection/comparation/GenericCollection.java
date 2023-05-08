package collection.comparation;

import java.util.Collection;
import java.util.Random;

public class GenericCollection {
    private Collection<String> data;

    public GenericCollection(Collection<String> collection) {
        data = collection;
    }

    public void addALl(int size){
        for (int i=0; i<size; i++){
            data.add(getRundomString(5,10));
        }
    }

    public void printCollection(){
        System.out.println("Collection class: " + data.getClass().getName());
        System.out.println("Collection data: " + data);
    }

    private String getRundomString(int from, int to) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = random.nextInt(to - from + 1) + from;

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }
    public void remove(int indexToRemove){
        int index = 0;
        for (String element:data) {
            if (index == indexToRemove){
                data.remove(element);
                System.out.println("Removed element: " + element);
                break;
            }
            index++;
        }
    }

    public void remove(int[] indexToRemove){
        for (int index:indexToRemove) {
            remove(index);
        }
    }
}

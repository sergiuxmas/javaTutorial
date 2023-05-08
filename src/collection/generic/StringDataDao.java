package collection.generic;

import java.util.*;

public class StringDataDao<T extends Collection<String>> {
    private Collection<String> data;

    public StringDataDao(Class<T> dataClass) {
        switch (dataClass.getName()) {
            case "java.util.ArrayList": {
                this.data = new ArrayList<>();
                break;
            }
            case "java.util.LinkedList": {
                this.data = new LinkedList<>();
                break;
            }
            case "java.util.HashSet": {
                this.data = new HashSet<>();
                break;
            }
            case "java.util.TreeSet": {
                this.data = new TreeSet<>();
                break;
            }
            case "java.util.LinkedHashSet": {
                this.data = new LinkedHashSet<>();
                break;
            }
            default: {
                data = null;
                System.out.println("Not supported collection type: " + dataClass.getName());
            }
        }
    }

    public void setData(int size) {
        for (int i = 0; i < size; i++) {
            data.add(getRundomString(5, 10));
        }
    }

    public Collection<String> getData() {
        return data;
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

    public void printData() {
        System.out.println("Collection class: " + data.getClass().getName());
        System.out.println("Collection data: " + data);
    }

    public void removeElement(int indexToRemove) {
        int initialSize = data.size();
        int index = 0;
        for (String element: data) {
            if (index == indexToRemove){
                data.remove(element);
                System.out.println("Removed element: " + element);
                break;
            }
            index++;
        }
        if (initialSize == data.size()){
            new RuntimeException("No element was removed");
        }
    }

}

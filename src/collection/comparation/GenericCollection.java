package collection.comparation;

import java.util.*;

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
        data.forEach(element ->{

        });

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
            updateIndex(indexToRemove, index);
        }
    }

    public void removeIterable(int[] indexToRemove){
        if (data instanceof List) {
            int i = 0;
            ListIterator<String> iterator = ((List)data).listIterator();
            while (iterator.hasNext()){
                String currentElement = iterator.next();
                int toBeRemoved = hasValue(indexToRemove,i);
                if (toBeRemoved != -1){
                    iterator.remove();
                    if (i == 0){
                        iterator = ((List)data).listIterator();
                    }
                    System.out.println("Removed element: " + currentElement);
//                    updateIndex(indexToRemove, toBeRemoved);
                }
                i++;
            }
        } else {
            remove(indexToRemove);
        }
    }

    private int hasValue(int[] indexToRemove, int value){
        for (int i = 0; i < indexToRemove.length; i++) {
            if (indexToRemove[i] == value){
                return indexToRemove[i];
            }
        }
        return -1;
    }

    private void updateIndex(int[] indexToRemove, int index){
        for (int i = index; i < indexToRemove.length; i++) {
            indexToRemove[i] = indexToRemove[i] - 1;
        }
    }
}

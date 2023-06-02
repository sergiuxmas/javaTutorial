package collection.task1_HashSet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordCounter {

    private String filePath = "C:\\Users\\screciun\\IdeaProjects\\Tutorial-explore-base\\src\\collection\\task1_HashSet\\file.txt";

    public static Set countWords(String filePath){
        String text = "";
        try(FileReader fr = new FileReader(filePath)){
            int i;
            while((i=fr.read())!=-1){
                text+=(char)i;
            }
        String[] array = text.split(" ");
        return Set.of(array);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("dd");
        }
        return null;
    }
}

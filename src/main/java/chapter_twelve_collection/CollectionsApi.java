package chapter_twelve_collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CollectionsApi {
    public static void main(String[] args) {
        Set<String> filterWord = new HashSet<>();
        filterWord.add("a");
        filterWord.add("a");
        filterWord.add("b");
        filterWord.forEach((a)->{
            System.out.println(a);
            filterWord.remove(a);
        });
    }
}

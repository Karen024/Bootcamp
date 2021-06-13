package OptionalClasswork.maps;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("yellowShirt");
        list.add("redHat");
        list.add("blackShirt");
        list.add("bluePants");
        list.add("redHat");
        list.add("pinkHat");
        list.add("blackShirt");
        list.add("yellowShirt");
        list.add("greenPants");
        list.add("greenPants");
        HashMapProblems hashMapProblems = new HashMapProblems();
        System.out.println(hashMapProblems.commerceProblem(list));
    }

}

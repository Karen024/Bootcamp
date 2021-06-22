package OptionalClasswork.streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StreamProblems streamProblems = new StreamProblems();
        List<Person> personList = new ArrayList<>();
        Person person = new Person(85, "Poxos");
        Person person2 = new Person(15, "Petros");
        Person person3 = new Person(16, "Martiros");
        Person person4 = new Person(75, "Papiroz");
        personList.add(person);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        /*System.out.println(streamProblems.allToUpperCase(stringList).toString());
        System.out.println(streamProblems.filterList(stringList).toString());*/

        /*System.out.println(streamProblems.flattenMultidimensionalCollection(stringList));*/

        /*System.out.println(streamProblems.oldestPerson(personList).getName());*/

        /*streamProblems.allKids(personList).stream().forEach((kid) -> {
            System.out.print(kid.getName() + " ");
        });*/

        /*List<Object> array1 = Arrays.asList(streamProblems.kidsAndNot(personList).get(true).toArray());
        List<Object> array2 = Arrays.asList(streamProblems.kidsAndNot(personList).get(false).toArray());
        System.out.println(array1.toString());
        System.out.println(array2.toString());*/
    }
}

package collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

import static java.util.stream.Collectors.groupingBy;

public class Java8Grouping {

    public static void main(String[] args) {


        System.out.println("Allah Enough");

        Persons persons1 = new Persons("John", "USA", "NYC", new Pet("Max", 5));
        Persons person2 = new Persons("Steve", "UK", "London", new Pet("Lucy", 8));
        Persons persons3 = new Persons("Anna", "USA", "NYC", new Pet("Buddy", 12));
        Persons persons4 = new Persons("Mike", "USA", "Chicago", new Pet("Duke", 10));
        List<Persons> persons = Arrays.asList(persons1, person2, persons3, persons4);

        Java8Grouping group = new Java8Grouping();
        Map<String, Map<String, Map<String, List<Persons>>>> personsByCountryCityAndPetName = group.threeLevelGrouping(persons);

        
    }

    public  Map<String, Map<String, Map<String, List<Persons>>>> threeLevelGrouping(List<Persons> persons) {
         Map<String, Map<String, Map<String, List<Persons>>>> personsByCountryCityAndPetName = persons.stream().collect(
                groupingBy(Persons::getCountry,groupByCityAndPetName())
        );
        System.out.println(personsByCountryCityAndPetName);
         return personsByCountryCityAndPetName;

    }

    private Collector<Persons, ?, Map<String, Map<String, List<Persons>>>> groupByCityAndPetName() {
        return groupingBy(Persons::getCity, groupingBy(p -> p.getPet().getName()));
    }
}

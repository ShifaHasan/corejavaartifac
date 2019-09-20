package com.sg.j8.lampdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

import static java.util.stream.Collectors.groupingBy;

public class Java8Grouping {

    public static void main(String[] args) {
        System.out.println("Allah Enough");
        Person person1 = new Person("John", "USA", "NYC", new Pet("Max", 5));
        Person person2 = new Person("Steve", "UK", "London", new Pet("Lucy", 8));
        Person person3 = new Person("Anna", "USA", "NYC", new Pet("Buddy", 12));
        Person person4 = new Person("Mike", "USA", "Chicago", new Pet("Duke", 10));
        List<Person> persons = Arrays.asList(person1, person2, person3, person4);

        Java8Grouping group = new Java8Grouping();
        Map<String, Map<String, Map<String, List<Person>>>> personsByCountryCityAndPetName = group.threeLevelGrouping(persons);

        
    }

    public  Map<String, Map<String, Map<String, List<Person>>>> threeLevelGrouping(List<Person> persons) {
         Map<String, Map<String, Map<String, List<Person>>>> personsByCountryCityAndPetName = persons.stream().collect(
                groupingBy(Person::getCountry,groupByCityAndPetName())
        );
        System.out.println(personsByCountryCityAndPetName);
         return personsByCountryCityAndPetName;

    }

    private Collector<Person, ?, Map<String, Map<String, List<Person>>>> groupByCityAndPetName() {
        return groupingBy(Person::getCity, groupingBy(p -> p.getPet().getName()));
    }
}

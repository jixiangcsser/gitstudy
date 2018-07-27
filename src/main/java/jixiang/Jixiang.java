package jixiang;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

public class Jixiang {
    public static void main(String[] args) {
        System.out.println("ssss");
        List<Person> persons= Lists.newArrayList(
                new Person("jix",21),
                new Person("mayun",55),
                new Person("mayun1",53)

        );
        Map<String,Person> map= Maps.uniqueIndex(persons, new Function<Person, String>() {

            public String apply(Person person) {
                return person.getName();
            }
        });
        List<Person> personsList=Lists.newArrayList();
        for(Map.Entry<String,Person> entry:map.entrySet()){
            System.out.println(entry.getKey());
            personsList.add(entry.getValue());
        }
        System.out.println(personsList.toString());
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

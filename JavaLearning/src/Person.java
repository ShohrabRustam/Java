import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person>{

    public int age;
    public String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{age=" + age + ", name='" + name + "'}";
    }

    public  static void main(String[] args){

        List<Person> personList = new ArrayList<>();

        personList.add(new Person(30,"Rustam"));
        personList.add(new Person(21,"Shohrab"));
        personList.add(new Person(22,"Saif"));
        Collections.sort(personList);

        for(Person person: personList){
            System.out.println(person);
        }

    }

    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }

//    @Override
//    public int compareTo(Person person) {
//        return Integer.compare(this.age,person.age);
//    }
}

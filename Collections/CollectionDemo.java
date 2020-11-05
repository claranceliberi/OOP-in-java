import java.util.*;

public class CollectionDemo{
    public static void main(String[] args){

        List <Person> persons = new ArrayList<Person>();
        persons.add(new Person<Integer, String>(33, 34, " Ntwari Liberi"));
        persons.add(new Person<Integer, String>(21,22, "Divin Irakiza"));
        persons.add(new Person<Integer, String>(21,22, "Divin Irakiza"));
        persons.add(new Person<Integer, String>(21,22, "Divin Danny"));
        persons.add(new Person<Integer, String>(21,22, "Clarance Irakiza"));
        persons.add(new Person<Integer, String>(21,22, "Inkuba Joo"));

        for(int i=0; i < persons.size(); i++){
            Person p = persons.get(i);
            System.out.println("Person " + p.getName());
        }

        for(Person p:persons){
            System.out.println(p.getName() + " is " + p.getAge() + " years old and " + p.getHeight() + " cm of height");
        }
    }
}
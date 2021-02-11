package SET;

import java.util.*;

public class SetDemo{
    public static void main(String[] args) throws Exception{
//        initialize person objects
        Person<Integer,String> p1 = new Person<Integer,String>(32, 173, "Ntwari clarance liberiste");
        Person<Integer,String> p2 = new Person<Integer,String>(32, 173, "Ntwari clarance liberiste");

//        initialize person set
        Set <Person <Integer, String>> persons = new HashSet<Person<Integer,String>>();

//        add person objects to set
        persons.add(p1);
        persons.add(p2);

        for(Person p:persons){
            System.out.println(p.getName() + " is " + p.getAge() + " years old and has " + p.getHeight() + " cm of height");
        }
    }
}
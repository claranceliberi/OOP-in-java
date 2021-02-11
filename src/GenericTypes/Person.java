package GenericTypes;

public class Person<T, K>{
    private T age;
    private T height;
    private K name;

    //constructor
    public Person(T age, T height, K name){
        this.age = age;
        this.height = height;
        this.name = name;
    }

    //get height
    public T getHeight() {
        return height;
    }

    //set height
    public void setHeight(T height) {
        this.height = height;
    }

    //get name
    public K getName() {
        return name;
    }

    //st height
    public void setName(K name) {
        this.name = name;
    }

    //get age
    public T getAge() {
        return age;
    }

    //set age
    public void setAge(T age) {
        this.age = age;
    }


}


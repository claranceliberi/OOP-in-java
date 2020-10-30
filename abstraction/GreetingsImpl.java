interface Greetings{

    void sayHello();

}

class GreetingsImpl implements Greetings {

    public void sayHello(){System.out.println("Hello Guys!");}


    public static void main(String args[]){

        GreetingsImpl greeting = new GreetingsImpl();

        greeting.sayHello ();

    }

}
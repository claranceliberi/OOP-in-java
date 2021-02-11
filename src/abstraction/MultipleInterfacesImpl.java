// First interface
interface Printable{

    void print();

}

// Second interface
interface Showable{

    void show();

}

// Two interfaces implementation by one class
class MultipleInterfacesImpl implements Printable,Showable{


    public void print(){


        System.out.println("Hello");


    }

    public void show(){

        System.out.println("Welcome");

    }

    public static void main(String args[]){

        MultipleInterfacesImpl interfcesDemo=new MultipleInterfacesImpl();

        interfcesDemo.print();

        interfcesDemo.show();

    }

}
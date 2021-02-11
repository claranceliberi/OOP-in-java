interface Printable{

        void print();

        }

interface Showable extends Printable{

    void show();

}

class InterfaceInhertanceDemo implements Showable{

    public void print(){

        System.out.println("Hello");

    }

    public void show(){

        System.out.println("Welcome");

    }

    public static void main(String args[]){

        InterfaceInhertanceDemo demoObj =new InterfaceInhertanceDemo();

        demoObj.print(); // from Printable interface

        demoObj.show(); // from Showable interface

    }

}
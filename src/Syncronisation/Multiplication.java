package Syncronisation;

public class Multiplication {
    public void multiply(Long number) throws Exception{
        for(int i=0; i <= number; i++){
            System.out.println(number + " * " + i + " = " + i*number);
            Thread.sleep(200);
        }
    }

}

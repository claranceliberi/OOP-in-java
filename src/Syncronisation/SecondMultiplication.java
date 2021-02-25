package Syncronisation;

public class SecondMultiplication extends Thread{
    private Long number;
    private Multiplication multi;

    public SecondMultiplication(Long number, Multiplication multi){
        this.number = number;
        this.multi = multi;
    }

    public void run(){

        try{
            multi.multiply(this.number);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

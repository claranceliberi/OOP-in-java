package composition;

class Bike{
    //decraling data members and methods
    private String color;
    private int wheels;

    public void bikeFeatures(){
        System.out.println("Bike color=" + color + " wheels=" + wheels);
    }

    public  void setColor(String color){
        this.color = color;
    }

    public  void setWheels(int wheels){
        this.wheels = wheels;
    }
}
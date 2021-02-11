package composition;

class CompositionDemo{
    public static void main(String[] args){
        Honda h = new Honda();

        h.setColor("Black");
        h.setWheels(2);
        h.bikeFeatures();
        h.start();
        h.stop();

    }
}
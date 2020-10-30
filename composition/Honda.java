class Honda extends Bike{
    public HondaEngine engine;

    public void start(){
        engine = new HondaEngine();
        engine.start();
    }

    public  void stop(){
        if(engine != null){
            engine.stop();
        }
    }

}
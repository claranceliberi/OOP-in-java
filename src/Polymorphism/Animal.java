

class Animal {
    private String name;
    private int age;
    protected String foodType;
    private String sound;

    public Animal(){

    }
    public Animal(String name, int age, String foodType, String sound){
        this.name = name;
        this.age = age;
        this.foodType = foodType;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
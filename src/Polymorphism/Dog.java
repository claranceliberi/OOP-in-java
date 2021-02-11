class Dog{

    class Dog extends Animal {


        private String tail;
        private String eyeColor;


        public Dog (){
            super("", 4, "carnive", "woooo");
            super.setFoodType("ddsd");
        }

        public Dog(String name, int age, String foodType, String sound, String eyeColor, String tail){
            super(name, age, foodType, sound);
            this.eyeColor = eyeColor;
            this.tail = tail;
        }
//
//    public Dog(String foodType){
//        super("BullDog", 4, foodType, "Bark");
//    }
//
//    public Dog (String foodType, int age){
//        super("", age, foodType, "");
//    }
//    public Dog(int age){
//        super("BullDog", age, "", "Bark");
//    }

        public String getTail() {
            return tail;
        }


        public void setTail(String tail) {
            this.tail = tail;
        }

        public String getEyeColor() {
            return eyeColor;
        }

        public void setEyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
        }

        public String bark(String sound) {
            this.setSound(sound);
            return this.getSound();
        }

    }
}
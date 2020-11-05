public class GenericDemo {
    public static void main(String[] args) throws Exception{
        Person <Integer, String> p1 = new Person<Integer, String>(32, 173, "Ntwari clarance");
        Person <String, String> p2  = new Person<String, String>("32 years", "173cm", "Irakiza Divin");

        System.out.println(" age : " + p1.getAge() + ", height: " + p1.getHeight() + ", names: " + p1.getName());
        System.out.println(" age : " + p2.getAge() + ", height: " + p2.getHeight() + ", names: " + p2.getName());
    }
}
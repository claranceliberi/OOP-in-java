import java.time.LocalDate;

public class Main {
    
    public static void main(String[] args){
        PersonService pers = new PersonService();
        
        LocalDate mybirth = LocalDate.of(2003,10,03);
        pers.setBirthDate(mybirth);
        int years = pers.getHisAge(pers.getBirthDate());

        System.out.println("He/She is " + years + " old");
    }
}

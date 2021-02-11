import java.time.LocalDate;
import java.time.ZoneId;

public class PersonService extends Person {

    @Override
    public int getHisAge(LocalDate birthDate){
        
        ZoneId zone = ZoneId.of("Africa/Kigali");
        LocalDate currentDate = LocalDate.now(zone);
         

        return currentDate.getYear() - birthDate.getYear();
    }
}

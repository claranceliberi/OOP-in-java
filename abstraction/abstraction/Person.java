import java.time.LocalDate;

public abstract class Person{
    private LocalDate birthDate;
    public abstract int getHisAge(LocalDate birthDate);

    public LocalDate getBirthDate(){
        return this.birthDate;
    }

    public void setBirthDate(LocalDate date){
        this.birthDate = date;
    }
}
import java.time.LocalDate;
import java.time.Month;


public class User {
    private int pin;
    private double balance;
    private LocalDate dateOfBirth;
    private String name;

    public User(int pin,double balance,LocalDate dateOfBirth,String name){
        this.pin=pin;
        this.balance=balance;
        this.dateOfBirth=dateOfBirth;
        this.name=name;
    }

    public User(){
        pin = -1;
        balance = -1;
        dateOfBirth = LocalDate.MIN;
        name = "";
    }



}

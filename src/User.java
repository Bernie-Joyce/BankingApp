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
    public int getPin(){
        return this.pin;
    }
    public double getBalance(){
        return this.balance;
    }
    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }
    public String getName(){
        return this.name;
    }

    public String setPin(int pin){
        pin = this.pin;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
}

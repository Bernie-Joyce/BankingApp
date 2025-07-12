import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;


public class User {
    private int pin;
    private double balance;
    private LocalDate dateOfBirth;
    private String name;
    private ArrayList<Loan> loanList;

    public User(){
        pin = -1;
        balance = -1;
        dateOfBirth = LocalDate.MIN;
        name = "";
        loanList=new ArrayList<>();
    }
    public User(int pin,double balance,LocalDate dateOfBirth,String name, ArrayList<Loan> loanList){
        this.pin=pin;
        this.balance=balance;
        this.dateOfBirth=dateOfBirth;
        this.name=name;
        this.loanList = loanList;

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

    public ArrayList<Loan> getLoanList(){
        return this.loanList;
    }

    public void setPin(int pin){
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
    public void setLoanList(ArrayList<Loan> loanList){
        this.loanList=loanList;
    }
}

import java.time.LocalDate;

public class Loan {
    private double loanBalance;
    private double intrestRate;
    private LocalDate startingDate;
    private double minPayment;

    public Loan(){
        loanBalance = -1;
        intrestRate = 0;
        startingDate = LocalDate.MIN;
        minPayment = -1;
    }

    public Loan(double loanBalance, double intrestRate, LocalDate startingDate, double minPayment){
        this.loanBalance= loanBalance;
        this.intrestRate=intrestRate;
        this.startingDate=startingDate;
        this.minPayment=minPayment;
    }

    public double getLoanBalance(){
        return this.loanBalance;
    }
    public double getIntrestRate(){
        return this.intrestRate;
    }
    public LocalDate getStartingDate(){
        return this.startingDate;
    }
    public double getMinPayment(){
        return this.minPayment;
    }

    public void setLoanBalance(double loanBalance){
        this.loanBalance=loanBalance;
    }
    public void setIntrestRate(double intrestRate){
        this.intrestRate=intrestRate;
    }
    public void setStartingDate(LocalDate startingDate){
        this.startingDate=startingDate;
    }
    public void setMinPayment(double minPayment){
        this.minPayment=minPayment;
    }
}

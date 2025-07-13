import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {

        Loan loan = new Loan(1000, 0.1, LocalDate.of(2000,Month.MARCH,17),200);
        Loan loan1 = new Loan();
        System.out.println(loan.toString());

        ArrayList<Loan> loanList = new ArrayList<>();
        loanList.add(loan);
        User user = new User(1234, 10000, LocalDate.of(2006, Month.FEBRUARY, 4), "Bernard Joyce", loanList);
        System.out.println(user.toString());

        double loanBalTest = loan.getLoanBalance();
        double intrestRateTest = loan.getIntrestRate();
        LocalDate startingDateTest = loan.getStartingDate();
        double minPayTest = loan.getMinPayment();

        System.out.println("Testing getter methods: "+ loanBalTest + "; "+intrestRateTest + "; "+startingDateTest + "; "+minPayTest);

        loan1.setLoanBalance(2000);
        loan1.setIntrestRate(1.1);
        loan1.setStartingDate(LocalDate.of(2025,Month.NOVEMBER,21));
        loan1.setMinPayment(135);

        System.out.println(loan1.toString());
    }
}

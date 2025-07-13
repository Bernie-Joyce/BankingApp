import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {

        Loan loan = new Loan(1000, 0.1, LocalDate.of(2000,Month.MARCH,17),200);
        System.out.println(loan.toString());

        ArrayList<Loan> loanList = new ArrayList<>();
        loanList.add(loan);
        User user = new User(1234, 10000, LocalDate.of(2006, Month.FEBRUARY, 4), "Bernard Joyce", loanList);
        System.out.println(user.toString());


    }
}

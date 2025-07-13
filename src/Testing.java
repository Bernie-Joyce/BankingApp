import java.time.LocalDate;
import java.time.Month;

public class Testing {
    public static void main(String[] args) {

        Loan loan = new Loan(1000, 0.1, LocalDate.of(2000,Month.MARCH,17),200);
        System.out.println(loan.toString());
    }
}

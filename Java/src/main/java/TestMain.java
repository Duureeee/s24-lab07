
import account.DebitCard;
import account.Loan;
import account.Student;

public class TestMain {
    public static void main(String[] args) {
        Student student = new Student("Suldee", 2025001, 3.75);
        System.out.println("Student: " + student.getName() + ", ID: " + student.getStudentID() + ", GPA: " + student.getGPA());

        Loan loan = new Loan("Suldee", 1001, 50000, 5000);
        System.out.println("Loan Balance: " + loan.getBalanceRemaining());
        System.out.println("Pay loan 4000: " + loan.pay(4000));
        System.out.println("Pay loan 6000: " + loan.pay(6000));
        System.out.println("Loan Balance after payment: " + loan.getBalanceRemaining());

        DebitCard debitCard = new DebitCard("Suldee", 2001, 10000);
        System.out.println("DebitCard Balance: " + debitCard.getBalance());
        System.out.println("Pay debit 12000: " + debitCard.pay(12000));
        System.out.println("Pay debit 7000: " + debitCard.pay(7000));
        System.out.println("DebitCard Balance after payment: " + debitCard.getBalance());
    }
}

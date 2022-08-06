package Assignment_2;
import java.util.Date;

// Kaila Divy
// 21ce049
public class assignment_2_2 {
    private int id;
    private double balance;
    private double interestanual;
    private Date dateCreated = new Date();


    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestanual() {
        return interestanual;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestanual(double interestanual) {
        this.interestanual = interestanual;
    }

    void getMonthlyInterestRate()
    {
        System.out.println("ID - "+id);
        System.out.println("BALANCE - "+balance);
        System.out.println("MONTHLY INTEREST RATE - "+interestanual/12);
        System.out.println(dateCreated.toString());
    }

    void getMonthlyInterest()
    {
        System.out.println("ID - "+id);
        System.out.println("BALANCE - "+balance);
        System.out.println("MONTHLY INTEREST _ "+(balance*interestanual)/100 );
        System.out.println(dateCreated.toString());
    }

    assignment_2_2()
    {
        id = 0;
        balance = 500;
        interestanual = 7;
    }
    assignment_2_2(int n,double m)
    {
        id = n;
        balance = m;
    }

    public static void main(String[] args) {
        assignment_2_2 a1 = new assignment_2_2();
        a1.getMonthlyInterestRate();
        a1.getMonthlyInterest();
    }
}

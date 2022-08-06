package Assignment_2;
import java.util.Date;
// Kaila Divy
// 21ce049
 class assignment_2_4_Account {
    private int id;
    private double balance;
    private static double InterestRate;
    private Date dateCreated;

    assignment_2_4_Account() {
        //defalt constucter

    }

    assignment_2_4_Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        InterestRate = 0;
        dateCreated = new Date();
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//    public static double getInterestRate() {
//        return InterestRate;
//    }

    public static void setInterestRate(double interestRate) {
        InterestRate = interestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

//    public void setDateCreated(Date dateCreated) {
//        this.dateCreated = dateCreated;
//    }

    public void Deposit(double a)
    {
        balance =balance+a;

    }
    public void withdraw(double b)
    {
        balance =balance-b;

    }
    public String toString() {
        return "\nAccount ID: " + id + "\nDate: " + getDateCreated() + "\nBalance IS: " + String.format("%.4f", balance) ;

    }
}

class assignment_2_4_Saving_Account extends assignment_2_4_Account {

    assignment_2_4_Saving_Account() {
        super();
    }

    assignment_2_4_Saving_Account(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("This is Saving Account sd it cannot posible to overdraft");
        }
    }
}

 class assignment_2_4_CheckingAccount extends assignment_2_4_Account{

    private double OverDraft_Limit;

    assignment_2_4_CheckingAccount()
    {
        OverDraft_Limit=-50;

    }
    assignment_2_4_CheckingAccount(int id, double balance, double OverDraft_Limit)
    {
        super(id, balance);
        this.OverDraft_Limit = OverDraft_Limit;
    }

    public double getOverDraft_Limit() {
        return OverDraft_Limit;
    }

    public void setOverDraft_Limit(double overDraft_Limit) {
        OverDraft_Limit = overDraft_Limit;
    }

    public void withdraw(double amount) {
        if(getBalance()-amount >OverDraft_Limit)
        {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println("Error! Amount exceeds overdraft limit.");
    }

    public String ToString()
    {
        return super.toString() + "\nOverdraft limit: $" +
                String.format("%.2f", OverDraft_Limit);


    }

}


public class assignment_2_4 {
    public static void main(String[] args) {
        assignment_2_4_Account account =new assignment_2_4_Account(3,25000);
        assignment_2_4_Saving_Account saving_account =new assignment_2_4_Saving_Account(21,20000);
        assignment_2_4_CheckingAccount checking_Account =new assignment_2_4_CheckingAccount(49,30000,-60);

        account.setInterestRate(5);
        saving_account.setInterestRate(5);
        checking_Account.setInterestRate(5);


        //for withdaw
        account.withdraw(4500);
        saving_account.withdraw(3000);
        checking_Account.withdraw(1000);

        //for deposit
        account.Deposit(4000);
        saving_account.Deposit(5500);
        checking_Account.Deposit(1500);


        System.out.println(account.toString());
        System.out.println(saving_account.toString());
        System.out.println(checking_Account.toString());
//        System.out.println(account.getBalance());
//        System.out.println(saving_account.getBalance());
    }
}

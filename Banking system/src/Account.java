import java.util.*;

abstract public class Account {

    protected String accountNumber;
    protected String holderName;
    protected double balance;
//    protected static double balance;

    protected List<Transaction> transactions = new ArrayList<>();

    public Account(String accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount>0) {
            balance+=amount;
            transactions.add(new Transaction("DEPOSIT", amount, balance));
        }
    }

    public abstract void withdraw(double amount);

    public void transfer(Account toAccount, double amount){
        this.withdraw(amount);
        toAccount.deposit(amount);
        transactions.add(new Transaction("TRANSFER",amount,this.balance));
    }
    public double getBalance(){
        return balance;
    }
    public void showTransactions(){
        for(Transaction t: transactions){
            System.out.println(t);
        }
    }
}

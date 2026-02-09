public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accNo, String name, double balance, double overdraftLimit){
        super(accNo, name, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount){
        if(amount<=balance + overdraftLimit){
            balance-=amount;
            transactions.add(new Transaction("WITHDRAW", amount, balance));
        }
        else{
            System.out.println("Overdraft Limit Exceeded!");
        }
    }
}

public class SavingsAccount extends Account {
    private double intrestRate;
    public SavingsAccount(String accNo,String name, double balance, double intrestRate){
        super(accNo,name,balance);
        this.intrestRate=intrestRate;
    }

    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            transactions.add(new Transaction("WITHDRAW", amount, balance));
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}

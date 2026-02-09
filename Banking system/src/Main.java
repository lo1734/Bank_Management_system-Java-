public class Main{
    public static void main(String[] args){
        System.out.println("Banking System\n");

        Bank bank = new Bank();

        Account acc1 = new SavingsAccount("1001","Lohit",5000,4.0);
        Account acc2 = new CheckingAccount("2001","pandi", 4000, 2000);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
        acc1.deposit(1000);
        acc2.withdraw(1000);
        acc1.transfer(acc2,2000);
        acc1.showTransactions();
        System.out.println("----------");
        acc2.showTransactions();
    }
}
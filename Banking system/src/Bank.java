import java.util.*;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    public void addAccount(Account account){
        accounts.put(account.accountNumber,account);
    }
    public Account getAccount(String accNo){
        return accounts.get(accNo);
    }
}

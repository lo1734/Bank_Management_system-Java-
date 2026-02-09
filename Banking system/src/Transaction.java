import java.time.LocalDateTime;

public class Transaction {
    private String type; //Mode of transaction
    private double amount;
    private double balanceAfterTransaction;
    private LocalDateTime time;

    public Transaction(String type, double amount, double balanceAfterTransaction){
        this.type=type;
        this.amount=amount;
        this.balanceAfterTransaction=balanceAfterTransaction;
        this.time=LocalDateTime.now();
    }

    public String toString(){
        return type +
                "| Rs" +amount+
                "| Current Balance :"+ balanceAfterTransaction+
                "| Time "+ time;
    }
}

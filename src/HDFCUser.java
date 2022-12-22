import java.util.UUID;

public class HDFCUser implements Bankinterface{

    private String AccountNo;
    public String name;
    private int balance;
    public static float rateOfInterest;

    //Constructor

    public HDFCUser(String name, int balance) {
        this.name = name;
        this.balance = balance;

        this.AccountNo = String.valueOf(UUID.randomUUID());
    }

    //Getter and setter


    public String getAccountNo() {
        return AccountNo;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public int checkBalance() {
        return 0;
    }

    @Override
    public String addMoney(int money) {
        return null;
    }

    @Override
    public String withDrawMoney(int money,String enteredPassword) {
        return null;
    }

    @Override
    public float calculateInterest(int years) {
        return 0;
    }
}

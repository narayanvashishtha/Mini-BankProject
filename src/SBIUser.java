import java.util.Objects;
import java.util.UUID;

public class SBIUser implements Bankinterface{

    //attributes a bank should have
    private String AccountNo;
    public String name;
    private int balance;
    private String password;
    public static float rateOfInterest;

    //Constructor
    public SBIUser(String name, int balance) {
        this.name = name;
        this.balance = balance;

        this.AccountNo = String.valueOf(UUID.randomUUID());
    }
    //Getter and setters

    public String getName() {
        return name;
    }

    private void setPassword(String password){
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNo() {
        return AccountNo;
    }


    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int money) {
        balance = balance + money;
        return "Successfully added "+ money +" to your bank account";
    }

    @Override
    public String withDrawMoney(int money, String enteredPassword) {

        if(Objects.equals(enteredPassword, password)) {

            if (money > balance) {
                return "Khane ke Vaande hai";
            } else {
                balance = balance - money;
                return "Money has been withdrawn your updated balance is " + balance;
            }
        }

        else{
                return "Invalid Password";
            }
    }

    @Override
    public float calculateInterest(int years) {
        float interest = (balance * rateOfInterest * years)/10;
        return interest;
    }
}

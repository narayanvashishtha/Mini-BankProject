public interface Bankinterface {

    int checkBalance();

    String addMoney(int money);

    String withDrawMoney(int money,String enteredPassword);

    float calculateInterest(int years);
}

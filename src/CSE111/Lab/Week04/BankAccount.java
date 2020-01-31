package CSE111.Lab.Week04;

public class BankAccount {
    public static int totalAccounts;
    private String name="";
    private String address="";
    private String accountID="";
    private double balance=0.0;

    public BankAccount(){
        this("","","",0.0);
    }

    public BankAccount(String name, String address, String accountID, double balance){
        setName(name);
        setAddress(address);
        setAccountID(accountID);
        setBalance(balance);
        totalAccounts++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void addInterest(){
        this.balance*=1.07;
    }
    public String toString(){
        return String.format("Name : %-15sAddress : %-15s AccountID : %-12sBalance : %.2f$",getName(),getAddress(),getAccountID(),getBalance());
    }
}

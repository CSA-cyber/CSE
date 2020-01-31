package CSE111.Lab.Week04;

public class BankMAin {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Rafin Saheb","Dhaka","11111111",5000.00);
        BankAccount acc2 = new BankAccount("Niaz Shihab","Dhaka","11111112",7000.00);
        BankAccount acc3 = new BankAccount("Iffat Turna","Dhaka","11111111",6000.00);

        acc1.addInterest();
        acc3.addInterest();;

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
    }
}

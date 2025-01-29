package encapsulation;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public void setAccountNumber(String accountNumber){

        if (accountNumber.length()==10){
            this.accountNumber = accountNumber;
        }
        else {
            System.out.println("Invalid Account number! must be 10 digits....");
        }
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){

        if (amount>0){
            balance += amount;
        }
        else {
            System.out.println("unable to deposit less than or equals to 0.....");
        }

    }

    public void withdraw(double amount){

        if (amount>0 && amount<=balance){
            balance -= amount;
        }
        else {
            System.out.println("Insufficient balance to withdraw money...");
        }
    }
}

class Banktransaction{

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAccountNumber("1234567890");
        ba.deposit(1000);
        ba.withdraw(200);

        System.out.println("Account number - " + ba.getAccountNumber() + " having balance - " + ba.getBalance());


        BankAccount ba1 = new BankAccount();
        ba1.setAccountNumber("12345672341");
        ba1.deposit(0);
        ba1.withdraw(200);

        System.out.println("Account number - " + ba1.getAccountNumber() + " having balance - " + ba1.getBalance());
    }

}

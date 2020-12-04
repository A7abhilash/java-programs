import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int accountNo;
    private String name;
    private String accountType;
    private double balance;

    public Account(String name, String accountType){
            this.accountNo=new Date().hashCode();
            this.name=name;
            this.accountType=accountType;
            this.balance=0.0;
    }

    public int getId(){
        return accountNo;
    }

    public void displayBalance(){
        System.out.println("Total Balance: "+ balance);
    }

    public void depositAmount(double amount){
        balance+=amount;
        System.out.println("Amount Deposited: "+ amount);
        displayBalance();
        
    }
    
    public void withdrawAmount(double amount){
        if(amount>balance){
            System.out.println("Insufficient balance");
            return;
        }
        balance-=amount;
        System.out.println("Amount Withdrawn: "+amount);
        displayBalance();
        
    }

    public void getAccountDetails(){
        System.out.println("Account No.: "+accountNo);
        System.out.println("Name: "+name);
        System.out.println("Account Type: "+accountType);
        displayBalance();
        System.out.println();
    }
}

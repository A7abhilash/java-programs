public class Account {
    private int accountNo;
    private String name;
    private String accountType;
    private double balance;

    public Account(int accountNo,String name, String accountType){
            this.accountNo=accountNo;
            this.name=name;
            this.accountType=accountType;
            this.balance=0.0;
    }

    public void depositMoney(double amount){
        balance+=amount;
        System.out.println("Amount Deposited: "+ amount);
        System.out.println("Balance: "+ balance);
    }
    
    public void withdrawMoney(double amount){
        if(amount>balance){
            System.out.println("Insufficient balance");
            return;
        }
        balance-=amount;
        System.out.println("Amount Withdrawn: "+amount);
        System.out.println("Balance: "+ balance);
    }

    public void getAccountDetails(){
        System.out.println("Name: "+name);
        System.out.println("Balance: "+ balance);
    }
}

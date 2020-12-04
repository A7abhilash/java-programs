import java.util.ArrayList;
import java.util.Scanner;

public class ExecutiveAccount {
    static ArrayList<Account> accounts = new ArrayList<>() ;


    public static void accountNotFound(int accountNo){
        System.out.println("Account with no.: "+ accountNo +" doesn't exist.");
    }

    public static void addAccount(Account account){
       accounts.add(account);
       System.out.println("New account created with Id: "+ account.getId());
    }
    
    public static void removeAccount(int accountNo ){
        for(Account account:accounts){
            if(account.getId()==accountNo){
                accounts.remove(account);
                System.out.println("Account deleted.");
                return;
            }
        }
        accountNotFound(accountNo);
    }

    public static void getAccountsDetails(){
        if(accounts.size()==0){
            System.out.println("No accounts exist.");
            return;
        }
        for(Account account:accounts){
            account.getAccountDetails();
        }
    }

    public static void depositAmountToAccount(int accountNo,double amount){
        for(Account account:accounts){
            if(account.getId()==accountNo){
                account.depositAmount(amount);
                return;
            }
        }
        accountNotFound(accountNo);
    }

    public static void withdrawAmountFromAccount(int accountNo,double amount){
        for(Account account:accounts){
            if(account.getId()==accountNo){
                account.withdrawAmount(amount);
                return;
            }
        }
        accountNotFound(accountNo);
    }

    public static void main(String[] args) {
        int option;
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("\n0.exit\n1.Add account\n2.Remove account\n3.Deposit amount to certain account\n4.Withdraw amount to certain account\n5.Get account details\nEnter your option");
        option = scanner.nextInt();
        
            switch(option){
                case 0:break;
                case 1: System.out.println("Enter the depositor name and account type:");
                        Account account = new Account(scanner.nextLine(),scanner.nextLine());
                        addAccount(account);
                        break;
                case 2: System.out.println("Enter the id of the account you want to delete:");
                        removeAccount(scanner.nextInt());
                        break;
                case 3: System.out.println("Enter the id of the account and the amount to be deposited:");
                        depositAmountToAccount(scanner.nextInt(), scanner.nextDouble());
                        break;
                case 4: System.out.println("Enter the id of the account and the amount to be withdrawn:");
                        withdrawAmountFromAccount(scanner.nextInt(), scanner.nextDouble());
                        break;
                case 5: getAccountsDetails();
                        break;
                default:System.out.println("Enter proper option");
            }
        }while(option!=0);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank;
        ArrayList<Bank> banks = new ArrayList<>();
        int choice;

        do{
            System.out.println("\n0.Exit\n1.State Bank of India(SBI)\n2.Punjab National Bank(PNB)\n3.Karnataka Bank(KTK)\n4.Corporation Bank(CORP)\nSelect bank:");
            choice=sc.nextInt();

            if(choice==0) break;

            System.out.println("Enter the bank type: International or National?");
            String bankType=sc.next();

            System.out.println("Enter the amount you want to deposit?");
            double amount=sc.nextDouble();

            System.out.println("Enter the term?");
            int term=sc.nextInt();

            switch(choice){
                case 1: bank = new SBI(bankType);
                        bank.depositAmount(amount,term);
                        banks.add(bank);
                        break;
                case 2: bank = new PNB(bankType);
                        bank.depositAmount(amount,term);
                        banks.add(bank);
                        break;
                case 3: bank = new KTK(bankType);
                        bank.depositAmount(amount,term);
                        banks.add(bank);
                        break;
                case 4: bank = new CORP(bankType);
                        bank.depositAmount(amount,term);
                        banks.add(bank);
                        break;
                default: System.out.println("Enter proper choice");
            }
        }while(choice!=0);

        System.out.println("\nBank details:");
        for(Bank b : banks){
            System.out.println("---------------------");
            System.out.println("Bank name: "+b);
            System.out.println("Type: "+b.bankType);
            System.out.println("Balance: "+b.balance);
            System.out.println("ROI: "+b.rateOfInterest);
            System.out.println("Term: "+b.term);
        }

    }
}

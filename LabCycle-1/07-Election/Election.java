import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Candidate[] candidates = new Candidate[5];
        System.out.println("Enter 5 candidate details:");
        for(int i=0;i<5;i++){
            System.out.println("Enter the name of candidate and party " + (i+1));
            candidates[i]=new Candidate(sc.next(),sc.next());
        }
        int option,spoilCounts=0;
        do{
            System.out.println("\n0.Exit\n1.Cast vote to candidate\nEnter your option:");
            option=sc.nextInt();
            switch(option){
                case 0: break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5: candidates[option-1].castVote();
                        break;
                default: spoilCounts++;
            }
        }while(option!=0);

        Candidate winner = candidates[0];
        System.out.println("Results:");
        System.out.println("Name\t\tParty\t\tCounts");
        for(int i=0;i<5;i++){
            candidates[i].getInfo();
            if(winner.getCounts()<candidates[i].getCounts()){
                winner = candidates[i];
            }
        }
        
        System.out.println("\nWinner:");
        System.out.println("Name\t\tParty\t\tCounts");
        winner.getInfo();

        System.out.println("\nSpoil counts: "+spoilCounts);
    }
}

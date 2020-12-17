import java.util.Scanner;

public class PrimeNumbers{
    static boolean isPrime(int num){
        if(num==1) return false;
        for(int j=2;j<=(int)Math.sqrt(num);j++){
            if(num % j==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the range:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        
        System.out.println("Prime numbers in the given range:");
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
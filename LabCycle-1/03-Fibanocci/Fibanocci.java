//WAP to print N Fibonacci numbers

import java.util.Scanner;

public class Fibanocci{
    public static void main(String[] args) {
        int a=0,b=1,c,n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the range:");
        n=scanner.nextInt();
        System.out.println("Fibanocci series of given range is:");
        System.out.print(a+" "+b);
        for(int i=0;i<n-2;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
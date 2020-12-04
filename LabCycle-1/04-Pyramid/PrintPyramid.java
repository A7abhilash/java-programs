//WAP to print pyramid shape using * symbols

import java.util.Scanner;

public class PrintPyramid {
    public static void main(String[] args) {
        int n,i,j,k;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the height:");
        n = scanner.nextInt();

        for(i=1;i<=n;i++){
            for(j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

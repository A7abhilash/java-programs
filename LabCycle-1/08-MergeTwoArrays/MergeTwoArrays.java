import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[10];
        int i,j;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the elements of array 1: ");
        for(j=0;j<5;j++){
            a[j] = scanner.nextInt();
        }
        System.out.println("Enter the elements of array 2: ");
        for(j=0;j<5;j++){
            b[j] = scanner.nextInt();
        }
        for(i=0,j=0;i<10&&j<5;i+=2,j++){
            c[i]=a[j];
            c[i+1]=b[j];
        }

        for(i=0;i<10;i++){
            for(j=i;j>0;j--){
                if(c[j-1]>=c[j]){
                    int temp=c[j-1];
                    c[j-1]=c[j];
                    c[j]=temp;
                }
            }
        }

        for(j=0;j<10;j++){
            System.out.print(c[j] + " ");
        }
    }
}

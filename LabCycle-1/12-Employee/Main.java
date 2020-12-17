import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of employees:");
        int n=sc.nextInt();
        Employee[] employees = new Employee[n];

        for(int i=0;i<n;i++){
            employees[i]=new Employee();
            employees[i].addDetails();
            employees[i].compute();
        }
        
        System.out.println("Name\t\tID\t\tDept\t\tSalary\t\tGrossPay\t\tNetPay");
        for(int i=0;i<n;i++){
            employees[i].displayDetails();
        }
    }
}

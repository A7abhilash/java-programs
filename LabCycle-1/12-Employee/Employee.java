import java.util.Scanner;

public class Employee {
    int id;
    String name;
    String dept;
    double salary,grossPay,netPay,tax;
    Scanner sc = new Scanner(System.in);

    public void addDetails(){
        System.out.println("Enter the employee's name, ID, department and base salary:");
        name=sc.next();
        id = sc.nextInt();
        dept=sc.next();
        salary=sc.nextDouble();
    }

    public void compute(){
        grossPay=salary+(0.58*salary)+(0.16*salary);

        if(grossPay<=200000) tax=0;
        else if(grossPay<=300000) tax=0.1*grossPay;
        else if(grossPay<=500000) tax=0.15*grossPay;
        else{
            tax=0.3*grossPay;
            tax+=(0.2*tax);
        }
        netPay=grossPay-tax;
    }

    public void displayDetails(){
        System.out.println(name+"\t\t"+id+"\t\t"+dept+"\t\t"+salary+"\t\t"+grossPay+"\t\t"+netPay);
    }
}

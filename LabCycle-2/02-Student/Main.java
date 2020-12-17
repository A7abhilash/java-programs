import java.util.Scanner;

class Student {
    int rollNo;

    public void getRollNo(){
        System.out.println("Roll no.: "+ rollNo);
    }
    
    public void setRollNo(int no){
        rollNo=no;
    }
}

class Test extends Student{
    int marks1;
    int marks2;

    public void getmarks(){
        System.out.println("Marks 1: "+marks1);
        System.out.println("Marks 2: "+marks2);
    }

    public void setmarks(int m1,int m2){
        marks1=m1;
        marks2=m2;
    }
}

interface Sports{
    public void getSportsWeightage();
    public void setSportsWeightage(int sw);
}

class Result extends Test implements Sports{
    int sportsWeightage, total;

    public void getSportsWeightage(){
        System.out.println("Sports weightage: "+sportsWeightage);
    }

    public void setSportsWeightage(int sw){
        sportsWeightage=sw;
    }

    public void displayResults(){
        this.getSportsWeightage();
        total=sportsWeightage+marks1+this.marks2;
        System.out.println("Total score: "+total);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of students:");
        int n = sc.nextInt();
        Result[] students = new Result[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter students details "+(i+1));
            students[i]=new Result();
            System.out.println("Student roll no.:");
            students[i].setRollNo(sc.nextInt());
            System.out.println("2 subject marks:");
            students[i].setmarks(sc.nextInt(),sc.nextInt());
            System.out.println("Sports weight:");
            students[i].setSportsWeightage(sc.nextInt());
        }

        for(int i=0;i<n;i++){
            System.out.println("\nStudent "+(i+1)+":\n_____________");
            students[i].getRollNo();
            students[i].getmarks();
            students[i].getSportsWeightage();
            students[i].displayResults();
        }
    }
}

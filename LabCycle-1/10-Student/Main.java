import java.util.Scanner;

class Student {
    // private int rollNo;
    private float marks[] =new float[3] ;
    private float totalMarks;

    Student(float m1,float m2, float m3){
        this.marks[0]=m1;
        this.marks[1]=m2;
        this.marks[2]=m3;
        this.totalMarks = this.marks[0] + this.marks[1] + this.marks[2];
    }

    public float[] getMarks(){
        return this.marks;
    }
    public float getTotalMarks(){
        return this.totalMarks;
    }
}

public class Main {

    public static void displayTotalMarks(Student students[]){
        System.out.println("Roll no.\tTotal marks");
        System.out.println("-----------------------");
        for(int i=0;i<5;i++){
            System.out.println((i+1)+"\t\t"+students[i].getTotalMarks());
        }
    }

    /* Minor bug in this */
    // public static void displayHighestMarksInEachSubject(Student students[]){
    //     float tempMax[]=new float[3];
    //     tempMax = students[0].getMarks();
    //     int rollNo[]=new int[3];
    //     float maxMarks[]=new float[3];
    //     maxMark[0]=tempMax[0];
    //     maxMark[1]=tempMax[1];
    //     maxMark[2]=tempMax[2];
    //     for(int i=1;i<5;i++){
    //         tempMax = students[i].getMarks();
    //         if(maxMark[0]>tempMax[0]){
    //             maxMark[0]=tempMax[0];
    //             rollNo[0]=i+1;
    //         }
    //         if(maxMark[1]>tempMax[1]){
    //             maxMark[1]=tempMax[1];
    //             rollNo[1]=i+1;
    //         }
    //         if(maxMark[2]>tempMax[2]){
    //             maxMark[2]=tempMax[2];
    //             rollNo[2]=i+1;
    //         }
    //     }
    //     for(int i=0;i<3;i++){
    //         System.out.println("Highest marks of Subject" + (i+1)+" :" + maxMarks[i] 
    //                             + " & is secured by Student with roll no.: "+ rollNo[i]);
    //     }
    // }

    public static void displayTopper(Student students[]){
        float maxMarks=students[0].getTotalMarks();
        int rollNo=1;
        for(int i=1;i<5;i++){
            if(students[i].getTotalMarks()>maxMarks){
                maxMarks=students[i].getTotalMarks();
                rollNo=i+1;
            }
        }
        System.out.println("The highest total marks is: " + maxMarks + " & it is secured by roll no.: " + rollNo);
    }

    public static void main(String[] args) {
        Student students[] =new Student[5];
        Scanner scanner=new Scanner(System.in);
        int i;
        
        for(i=0;i<5;i++){
            System.out.println("Enter the marks of student "+ (i+1) + ":");
            students[i] = new Student(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
        }
        System.out.println("");
        
        displayTotalMarks(students);
        // displayHighestMarksInEachSubject(students);
        displayTopper(students);
    }
}
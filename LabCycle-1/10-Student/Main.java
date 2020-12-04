import java.util.Scanner;

public class Main {

    public static void displayTotalMarks(Student students[]){
        System.out.println("Roll no.\tTotal marks");
        System.out.println("-----------------------");
        for(int i=0;i<3;i++){
            System.out.println((i+1)+"\t\t"+students[i].getTotalMarks());
        }
    }

    public static void displayHighestMarksInEachSubject(Student students[]){
        float tempMax[]=new float[3];
        tempMax = students[0].getMarks();
        int rollNo[]=new int[3];
        rollNo[0]=1;
        rollNo[1]=1;
        rollNo[2]=1;
        float maxMarks[]=new float[3];
        maxMarks[0]=tempMax[0];
        maxMarks[1]=tempMax[1];
        maxMarks[2]=tempMax[2];
        for(int i=1;i<3;i++){
            tempMax = students[i].getMarks();
            if(maxMarks[0]<tempMax[0]){
                maxMarks[0]=tempMax[0];
                rollNo[0]=i+1;
            }
            if(maxMarks[1]<tempMax[1]){
                maxMarks[1]=tempMax[1];
                rollNo[1]=i+1;
            }
            if(maxMarks[2]<tempMax[2]){
                maxMarks[2]=tempMax[2];
                rollNo[2]=i+1;
            }
        }
        System.out.println("Subject\tHighest Marks\tSecured by roll no.");
        for(int i=0;i<3;i++){
            System.out.println((i+1)+"\t"+maxMarks[i]+"\t\t"+rollNo[i]);
        }
    }

    public static void displayTopper(Student students[]){
        float maxMarks=students[0].getTotalMarks();
        int rollNo=1;
        for(int i=1;i<3;i++){
            if(students[i].getTotalMarks()>maxMarks){
                maxMarks=students[i].getTotalMarks();
                rollNo=i+1;
            }
        }
        System.out.println("-The highest total marks is: " + maxMarks + " secured by roll no.: " + rollNo);
    }

    public static void main(String[] args) {
        Student students[] =new Student[5];
        Scanner scanner=new Scanner(System.in);
        int i;
        
        for(i=0;i<3;i++){
            System.out.println("Enter the marks of student "+ (i+1) + ":");
            students[i] = new Student(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
        }
        System.out.println("");
        
        displayTotalMarks(students);
        displayHighestMarksInEachSubject(students);
        displayTopper(students);
    }
}
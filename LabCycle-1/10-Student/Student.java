
public class Student {
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

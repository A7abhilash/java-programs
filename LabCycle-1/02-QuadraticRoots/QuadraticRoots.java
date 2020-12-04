//WAP to find the roots of a quadratic equation;
import java.util.Scanner;
public class QuadraticRoots{
    public static void main(String[] args) {
        float a,b,c,discriminant,root1,root2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficient values:");
        a=scanner.nextFloat();
        b=scanner.nextFloat();
        c=scanner.nextFloat();

        if(a==0){
            System.out.println("Not the coefficients of a valid Quadratic Equation");
            System.exit(1);
        }

        discriminant = (b*b)-(4*a*c);

        if(discriminant==0){
            System.out.print("Roots are real and equal- ");
            root1 = (-b)/(2*a);
            System.out.println("Root1 and Root2 is: "+root1);
        }else if(discriminant>0){
            System.out.print("Roots are real and unequal- ");
            root1= ((-b)+(float)(Math.sqrt(discriminant)))/(2*a);
            root2= ((-b)-(float)(Math.sqrt(discriminant)))/(2*a);
            System.out.println("Root1: " + root1 + " and Root2: " + root2);
        }else {
            System.out.println("Roots are imaginary");}
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cube cube[] = new Cube[3];        
        Scanner scanner = new Scanner(System.in);
        
        for(int i=0;i<3;i++){
            System.out.println("Enter the side of cube "+(i+1)+": ");
            cube[i]=new Cube(scanner.nextInt());
        }
        for(int i=0;i<3;i++){
            System.out.println("\nCube "+(i+1)+": ");
            System.out.println("Surface Area: "+ cube[i].getSurfaceArea());
            System.out.println("Volume: "+ cube[i].getVolume());
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Area obj1 = new Area();
        Volume obj2 = new Volume();

        int choice;
        do{
            System.out.println("\n0.Exit\n1.Area of square\n2.Area of rectangle\n3.Area of circle\n4.Area of triangle");
            System.out.println("5.Volume of cube\n6.Volume of cuboid\n7.Volume of cylinder\nEnter your choice:");
            choice=sc.nextInt();

            switch(choice){
                case 0:break;
                case 1: System.out.println("Enter the side of square");
                        obj1.area(sc.nextInt());
                        break;
                case 2: System.out.println("Enter the length & breadth of rectangle");
                        obj1.area(sc.nextInt(),sc.nextInt());
                        break;
                case 3: System.out.println("Enter the radius of circle");
                        obj1.area(sc.nextDouble());
                        break;
                case 4: System.out.println("Enter the 3 sides of triangle");
                        obj1.area(sc.nextInt(),sc.nextInt(),sc.nextInt());
                        break;
                case 5: System.out.println("Enter the side of cube");
                        obj2.volume(sc.nextInt());
                        break;
                case 6: System.out.println("Enter the length,height & height of rectangle");
                        obj2.volume(sc.nextInt(),sc.nextInt(),sc.nextInt());
                        break;
                case 7: System.out.println("Enter the base radius & height of cylinder");
                        obj2.volume(sc.nextDouble(),sc.nextDouble());
                        break;
                default: System.out.println("Enter proper choice");
            }

        }while(choice!=0);
    }
}

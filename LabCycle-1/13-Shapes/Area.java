public class Area {
    public void area(int a){
        System.out.println("Area of square: "+(a*a));
    }
    
    public void area(double r){
        System.out.println("Area of circle: "+(Math.PI*r*r));
    }

    public void area(int a,int b){
        System.out.println("Area of rectangle: "+(a*b));
    }

    public void area(int a,int b,int c){
        double s =(a+b+c)/2.0;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle: "+area);
    }
}

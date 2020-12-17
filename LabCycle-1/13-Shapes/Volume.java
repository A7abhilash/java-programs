public class Volume {
    public void volume(int a){
        System.out.println("Volume of cube: "+(a*a*a));
    }
    
    public void volume(double r,double h){
        System.out.println("Volume of cylinder: "+(Math.PI*r*r*h));
    }

    public void volume(int a,int b,int c){
        System.out.println("Volume of rectangle: "+(a*b*c));
    }
}

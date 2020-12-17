public class Complex {
    double real,img;

    Complex(){
        real=1;
        img=1;
    }

    Complex(double a, double b){
        real=a;
        img=b;
    }

    static Complex add(int a, Complex C){
        Complex temp = new Complex();
        temp.real=a + C.real;
        temp.img = C.img;
        return temp;
    }

    static Complex add(Complex C1, Complex C2){
        Complex temp = new Complex();
        temp.real= C1.real + C2.real;
        temp.img = C1.img + C2.img;
        return temp;
    }

    public static void main(String[] args) {
        Complex S1 = new Complex(1.4, 2.5);
        Complex S2 = new Complex(2.4, 1.7);

        Complex temp = new Complex();
        temp=add(4, S1);
        System.out.println(temp.real+ " + i"+temp.img);
        
        temp=add(S1, S2);
        System.out.println(temp.real+ " + i"+temp.img);
    }
}

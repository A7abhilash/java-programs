public class Cube {
    private int side;

    public Cube(int side){
        this.side=side;
    }

    public int getSurfaceArea(){
        return 6*side*side; 
    }
    
    public int getVolume(){
        return side*side*side; 
    }
}

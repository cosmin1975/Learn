package incepatorOOP;

public class Punct2D {

    double x;
    double y;

    public Punct2D(float x, float y ){
        this.x = x;
        this.y = y;
    }

    public double modificaCoordonate(double x, double y){
        this.x = x;
        this.y = y;
        return modificaCoordonate(x, y);
    }
}

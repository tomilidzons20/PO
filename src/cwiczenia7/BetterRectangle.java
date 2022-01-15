package cwiczenia7;
import java.awt.Rectangle;

public class BetterRectangle extends Rectangle{
    // private Rectangle r;

    public BetterRectangle(int a, int b){
        // this.r = new Rectangle();
        // r.setSize(a, b);
        // r.setLocation(0, 0);
        super(a, b);
    }

    public double getPeremiter(){
        // return 2 * r.getHeight() + 2 * r.getWidth();
        return 2 * getHeight() + 2 * getWidth();
    }

    public double getArea(){
        // return r.getWidth() * r.getHeight();
        return getWidth() * getHeight();
    }

}

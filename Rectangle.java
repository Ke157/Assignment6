import java.io.Serializable;

/**
 * @program: homework_assignment_6
 * @filename: Rectangle
 * @author: Ke Chen
 * @date: 2020/10/31
 **/
public class Rectangle extends Shape{

    private double length; //length of the rectangle
    private double width;  //width of the rectangle

    /**
     * Constructor
     * @param len length of rectangle
     * @param wid width of rectangle
     */
    public Rectangle(double len, double wid) {
        super ("rectangle"); //call the constructor in the super class (Shape)
        this.length = len;
        this.width = wid;
    }

    /**
     * Area Implemented for rectangle
     *  @return area
     */
    public double computeArea() {
        return this.length * this. width;
    }

    public String toString() {
        String s = super.toString();
        s = s + " (length: " + length + " width: " + width + ")" ;
        return s;
    }

    @Override
    public void run() {
        System.out.printf("%s Area: %.2f\n", toString(), computeArea());
    }
}
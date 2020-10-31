import java.io.Serializable;

/**
 * @program: homework_assignment_6
 * @filename: Circle
 * @author: Ke Chen
 * @date: 2020/10/31
 **/
public class Circle extends Shape implements Serializable{

    private static final double PI = 3.14159265358979323;
    private double radius;

    /**
     * Constructor
     *
     * @param r radius of the circle
     */
    public Circle(double r) {
        super("circle"); //calls constructor in Shape class
        this.radius = r;
    }

    /**
     * Area method implemented for circle
     *
     * @return area
     */
    public double computeArea() {
        return PI * this.radius * this.radius;
    }

    public String toString() {
        String s = super.toString();
        s = s + " (radius: " + radius + ")";
        return s;
    }

    @Override
    public void run() {
        System.out.printf("%s Area: %.2f\n", toString(), computeArea());
    }
}

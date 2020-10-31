import java.io.Serializable;

/**
 * @program: homework_assignment_6
 * @filename: Hexagon
 * @author: Ke Chen
 * @date: 2020/10/31
 **/
public class Hexagon extends Shape implements Serializable{
    private double s;

    /**
     * Shape Constructor
     *
     * @param s the name of the shape
     */
    public Hexagon(double s) {
        super("Hexagon");
        this.s = s;
    }

    @Override
    public double computeArea() {
        return (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
    }

    public String toString() {
        String s = super.toString();
        s = s + " (length: " + this.s + "): ";
        return s;
    }

    @Override
    public void run() {
        System.out.printf("%s Area: %.2f\n", toString(), computeArea());
    }
}

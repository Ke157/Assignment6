import java.io.Serializable;

/**
 * @program: homework_assignment_6
 * @filename: Shape
 * @author: Ke Chen
 * @date: 2020/10/31
 **/
public abstract class Shape extends Thread implements Serializable{
    protected String name;

    /**
     *   Shape Constructor
     *   @param shapeName  the name of the shape
     */
    public Shape(String shapeName) {
        this.name = shapeName;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }

    /**
     *    Method abstract computeArea()
     *    To be implemented by the inheriting class.
     *
     *    @return the area of the shape.
     */
    abstract public double computeArea();
}